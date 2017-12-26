# 责任链模式 (Chain of Responsibility)
使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系， 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。

# 纯的与不纯的责任链模式
一个纯的责任链模式要求一个具体的处理者对象只能在两个行为中选择一个：一是承担责任，而是把责任推给下家。不允许出现某一个具体处理者对象在承担了一部分责任后又把责任向下传的情况。

在一个纯的责任链模式里面，一个请求必须被某一个处理者对象所接收；在一个不纯的责任链模式里面，一个请求可以最终不被任何接收端对象所接收。

纯的责任链模式的实际例子很难找到，一般看到的例子均是不纯的责任链模式的实现。有些人认为不纯的责任链根本不是责任链模式，这也许是有道理的。但是在实际的系统里，纯的责任链很难找到。
如果坚持责任链不纯便不是责任链模式，那么责任链模式便不会有太大意义了。

优点：
1. 降低耦合度：该模式使得一个对象无需知道是其他哪一个对象处理其请求。对象仅需知道该请求会被“正确”地处理。接收者和发送者都没有对方的明确的信息，且链中的对象不需知道链的结构。
2. 职责链可简化对象的相互连接:结果是，职责链可简化对象的相互连接。它们仅需保持一个指向其后继者的引用，而不需保持它所有的候选接受者的引用。
3. 增强了给对象指派职责(responsibility)的灵活性：当在对象中分派职责时，职责链给你更多的灵活性。你可以通过在运行时刻对该链进行动态的增加或修改来增加或改变处理一个请求的那些职责。你可以将这种机制与静态的特例化处理对象的继承机制结合起来使用。
4. 增加新的请求处理类很方便

缺点:
1. 不能保证请求一定被接收。既然一个请求没有明确的接收者，那么就不能保证它一定会被处理 —该请求可能一直到链的末端都得不到处理。一个请求也可能因该链没有被正确配置而得不到处理。
2. 系统性能将受到一定影响，而且在进行代码调试时不太方便；可能会造成循环调用。

# 责任链模式的实际应用
转自:https://www.cnblogs.com/lizo/p/7503862.html
### servlet中的Filter
servlet中分别定义了一个 Filter和FilterChain的接口，核心代码如下：
```
public final class ApplicationFilterChain implements FilterChain {
    private int pos = 0; //当前执行filter的offset
    private int n; //当前filter的数量
    private ApplicationFilterConfig[] filters;  //filter配置类，通过getFilter()方法获取Filter
    private Servlet servlet

    @Override
    public void doFilter(ServletRequest request, ServletResponse response) {
        if (pos < n) {
            ApplicationFilterConfig filterConfig = filters[pos++];
            Filter filter = filterConfig.getFilter();
            filter.doFilter(request, response, this);
        } else {
            // filter都处理完毕后，执行servlet
            servlet.service(request, response);
        }
    }

}
```


### Dubbo中的Filter
Dubbo在创建Filter的时候是另外一个方法，通过把Filter封装成 Invoker的匿名类，通过链表这样的数据结构来完成责任链，核心代码如下：
```
private static <T> Invoker<T> buildInvokerChain(final Invoker<T> invoker, String key, String group) {
    Invoker<T> last = invoker;
    //只获取满足条件的Filter
    List<Filter> filters = ExtensionLoader.getExtensionLoader(Filter.class).getActivateExtension(invoker.getUrl(), key, group);
    if (filters.size() > 0) {
        for (int i = filters.size() - 1; i >= 0; i --) {
            final Filter filter = filters.get(i);
            final Invoker<T> next = last;
            last = new Invoker<T>() {
                ...
                public Result invoke(Invocation invocation) throws RpcException {
                    return filter.invoke(next, invocation);
                }
                ...
            };
        }
    }
    return last;
}
```
Dubbo的责任链就没有类似FilterChain这样的类吧Filter和调用Invoker结合起来，而是通过创建一个链表，调用的时候我们只知道第一个节点，每个节点包含了下一个调用的节点信息。 这里的虽然Invoker封装Filter没有显示的指定next，但是通过java匿名类和final的机制达到同样的效果。


### Mybatis中的Plugin
Mybatis可以配置各种Plugin，无论是官方提供的还是自己定义的，Plugin和Filter类似，就在执行Sql语句的时候做一些操作。Mybatis的责任链则是通过动态代理的方式，使用Plugin代理实际的Executor类。（这里实际还使用了组合模式，因为Plugin可以嵌套代理），核心代码如下：
```
public class Plugin implements InvocationHandler{
    private Object target;
    private Interceptor interceptor;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (满足代理条件) {
            return interceptor.intercept(new Invocation(target, method, args));
        }
        return method.invoke(target, args);
    }

    //对传入的对象进行代理，可能是实际的Executor类，也可能是Plugin代理类
    public static Object wrap(Object target, Interceptor interceptor) {

        Class<?> type = target.getClass();
        Class<?>[] interfaces = getAllInterfaces(type, signatureMap);
        if (interfaces.length > 0) {
            return Proxy.newProxyInstance(
                    type.getClassLoader(),
                    interfaces,
                    new Plugin(target, interceptor, signatureMap));
        }
        return target;
    }
}
```
### 总结
这里简单介绍了Servlet、Dubbo、Mybatis对责任链模式的不同实现手段，其中Servlet是相对比较清晰，又易于实现的方式，而Dubbo和Mybatis则适合在原有代码基础上，增加责任链模式代码改动量最小的。

# 设计原则
