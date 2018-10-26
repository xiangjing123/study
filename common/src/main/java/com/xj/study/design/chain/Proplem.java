package com.xj.study.design.chain;

/**
 * 责任链模式-问题类
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-26 17:21
 */
public class Proplem {

    private int code;

    private String msg;

    public Proplem(int code) {
        this.code = code;
    }

    public Proplem(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
