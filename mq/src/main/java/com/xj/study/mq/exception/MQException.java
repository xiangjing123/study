package com.xj.study.mq.exception;

/**
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 14:37
 */
public class MQException extends  RuntimeException {

    private String msg;

    public MQException(Throwable cause) {
        super(cause);
    }

    public MQException(String msg) {
        this.msg = msg;
    }

    public MQException(String message, Throwable cause) {
        super(message, cause);
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
