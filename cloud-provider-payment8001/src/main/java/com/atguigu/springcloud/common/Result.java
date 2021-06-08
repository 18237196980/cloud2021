package com.atguigu.springcloud.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 公共返回结果对象
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public static <T> Result success() {
        return new Result(1, "", null);
    }

    public static <T> Result success(T data) {
        return new Result(1, "", data);
    }

    public static <T> Result success(String msg) {
        return new Result(1, msg, null);
    }

    public static <T> Result error(String msg) {
        return new Result(0, msg, null);
    }

    public static <T> Result error() {
        return new Result(0, "", null);
    }

    public static <T> Result error(T data) {
        return new Result(0, "", data);
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
