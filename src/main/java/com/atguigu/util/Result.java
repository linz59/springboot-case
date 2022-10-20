package com.atguigu.util;

import java.io.Serializable;

/**
 * @title
 * @ClassName Result
 * @Date 2022/10/20 10:45
 */

public class Result implements Serializable {
    private boolean status;
    private String msg;
    private Object data;


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //封装成功信息
    public static Result ok(Object data) {
        Result result = new Result();
        result.status = true;
        result.setData(data);
        return result;
    }

    //封装失败信息
    public static Result error(String msg) {
        Result result = new Result();
        result.setStatus(false);
        result.setMsg(msg);
        return result;
    }
}

