package com.irobot.admin.bean;

import org.apdplat.word.vector.T;

/**
 * @author zhangwl
 * @date 2019-12-27 10:26
 */
public class RespBean {
    private int code;
    private String msg;
    private T data;

    public static RespBean build() {
        return new RespBean();
    }

    public static RespBean ok(String msg) {
        return new RespBean(200, msg, null);
    }

    public static RespBean ok(String msg, T data) {
        return new RespBean(200, msg, data);
    }

    public static RespBean error(String msg) {
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, T data) {
        return new RespBean(500, msg, data);
    }

    private RespBean() {
    }

    private RespBean(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public RespBean setStatus(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RespBean setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public RespBean setData(T data) {
        this.data = data;
        return this;
    }
}
