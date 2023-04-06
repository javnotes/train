package com.example.train.member.req;

/**
 * 会员注册请求参数封装类
 *
 * @author luf
 * @date 2023/04/06 13:48
 **/
public class MemberRegisterReq {

    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "MemberRegisterReq{" +
                "mobile='" + mobile + '\'' +
                '}';
    }
}
