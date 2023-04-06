package com.example.train.common.exception;

/**
 * 业务异常枚举，与类BusinessException配合使用，主要是用于描述业务异常的信息desc
 * @author luf
 * @date 2023/04/06 14:05
 **/
public enum BusinessExceptionEnum {

    MEMBER_MOBILE_EXIST("手机号已注册");

    private String desc;

    BusinessExceptionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "BusinessExceptionEnum{" +
                "desc='" + desc + '\'' +
                "} " + super.toString();
    }
}
