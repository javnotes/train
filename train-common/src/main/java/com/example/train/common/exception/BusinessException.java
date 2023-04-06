package com.example.train.common.exception;

/**
 * 业务异常, 用于抛出业务异常, 由全局异常处理器捕获并处理, 返回给前端, 以便前端进行处理
 * 继承自RuntimeException, 使其成为一个运行时异常, 使其不需要在方法签名中进行声明
 * @author luf
 * @date 2023/04/06 14:04
 **/
public class BusinessException extends RuntimeException {

    private BusinessExceptionEnum e;

    public BusinessException(BusinessExceptionEnum e) {
        this.e = e;
    }

    public BusinessExceptionEnum getE() {
        return e;
    }

    public void setE(BusinessExceptionEnum e) {
        this.e = e;
    }

    /**
     * 不写入堆栈信息，提高性能
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
