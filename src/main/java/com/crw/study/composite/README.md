# 组合模式 (Composite Pattern)
组合模式，将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。掌握组合模式的重点是要理解清楚 “部分/整体” 还有 ”单个对象“ 与 "组合对象" 的含义。
组合模式可以让客户端像修改配置文件一样简单的完成本来需要流程控制语句来完成的功能。
经典案例：系统目录结构，网站导航结构等。

### 用途：
- 你想表示对象的部分-整体层次结构。
- 你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。

### 构建
Component（抽象构件接口）
- 为组合的对象声明接口
- 在某些情况下实现从此接口派生出的所有类共有的默认行为
- 定义一个接口可以访问及管理它的多个子部件

Leaf（叶部件）
- 在组合中表示叶节点对象，叶节点没有子节点
- 定义组合中接口对象的行为

Composite（组合类）
- 定义有子节点（子部件）的部件的行为
- 存储子节点（子部件）
- 在Component接口中实现与子部件相关的操作


# 设计原则