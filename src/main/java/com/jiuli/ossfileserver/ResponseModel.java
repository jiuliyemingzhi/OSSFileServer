package com.jiuli.ossfileserver;

import java.util.Date;



public class ResponseModel<T> {
    //成功
    public static final int SUCCEED = 1;
    //未知错误
    public static final int ERROR_UNKNOWN = 0;
    //错误的请求
    public static final int BAD_REQUEST = 4041;
    //验证错误
    public static final int ERROR_NO_PERMISSION = 2010;
    //服务器错误
    public static final int SERVICE_ERROR = 2010;

    private int code;
    private String message;
    private long time = new Date().getTime();
    private T result;

    public ResponseModel(T result) {
        this();
        this.result = result;
    }

    public ResponseModel() {
        message = "OK";
        code = SUCCEED;
    }

    public ResponseModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static <T> ResponseModel<T> buildOk() {
        return new ResponseModel<T>();
    }

    public static <T> ResponseModel<T> buildOk(T result) {
        return new ResponseModel<T>(result);
    }

    public static <M> ResponseModel<M> buildNoPermissionError() {
        return new ResponseModel<M>(ERROR_NO_PERMISSION, "你没有操作权限!");
    }

    public static <M> ResponseModel<M> buildBadRequestError() {
        return new ResponseModel<M>(BAD_REQUEST, "错误的请求!");
    }

    public static <M> ResponseModel<M> buildOtherError() {
        return new ResponseModel<M>(ERROR_UNKNOWN, "其他错误!");
    }

    public static <M> ResponseModel<M> buildServiceError() {
        return new ResponseModel<M>(SERVICE_ERROR, "服务器错误!");
    }


    public boolean success() {
        return code == SUCCEED;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
