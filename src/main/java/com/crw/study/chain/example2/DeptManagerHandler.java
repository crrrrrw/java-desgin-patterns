package com.crw.study.chain.example2;

/**
 * 部门经理处理请求
 */
public class DeptManagerHandler extends AbstractHandler {

    @Override
    public String handleRequest(FeeRequest feeRequest) {
        String str = "";
        //部门经理的权限只能在1000以内
        if (feeRequest.getFee() < 1000) {
            //为了测试，简单点，只同意张三的请求
            if ("张三".equals(feeRequest.getUserName())) {
                str = "成功：部门经理同意【" + feeRequest.getUserName() + "】的聚餐费用，金额为" + feeRequest.getFee() + "元";
            } else {
                //其他人一律不同意
                str = "失败：部门经理不同意【" + feeRequest.getUserName() + "】的聚餐费用，金额为" + feeRequest.getFee() + "元";
            }
        } else {
            //超过1000，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleRequest(feeRequest);
            }
        }
        return str;
    }
}

