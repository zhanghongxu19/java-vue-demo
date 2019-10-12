package com.vuedemo.demo.common;

public class Result<T> {

    private long code;

    private String msg;

    private T data;

    public Result() {
    }

    public Result(long code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static success (T data) {
        return new Result<T>(200L, "success", data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
