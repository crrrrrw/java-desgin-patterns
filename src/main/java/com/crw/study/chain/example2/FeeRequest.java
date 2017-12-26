package com.crw.study.chain.example2;

/**
 * 报销审批请求
 */
public class FeeRequest {

    String userName;// 用户
    double fee;// 花费

    public FeeRequest() {
    }

    public FeeRequest(String userName, double fee) {
        this.userName = userName;
        this.fee = fee;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
