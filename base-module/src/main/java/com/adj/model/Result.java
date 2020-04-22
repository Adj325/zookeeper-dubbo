package com.adj.model;

public class Result<T> {
    private Integer code;
    private Boolean success;
    private String message;
    private T data;

    public static Result error() {
        Result result = new Result();
        result.setCode(400);
        result.setMessage("请求失败");
        result.setSuccess(false);
        return result;
    }

    public static Result error(Integer code) {
        Result result = error();
        result.setCode(code);
        return result;
    }

    public static Result error(Integer code, String message) {
        Result result = error();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result ok() {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("请求成功");
        result.setSuccess(true);
        return result;
    }

    public static Result ok(Object data) {
        Result result = ok();
        result.setData(data);
        return result;
    }

    public static Result ok(Object data, String message) {
        Result result = ok(data);
        result.setMessage(message);
        return result;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Result setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
}
