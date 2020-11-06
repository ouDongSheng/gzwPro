package com.gzw.common;


import com.gzw.common.enums.ResponseStatusEnum;

public class Result {

    private int code;

    private Boolean success;

    //返回信息
    private String msg;

    private Object data;

    public Result() {
    }

    public static Result success() {
        return success("操作成功", null);
    }

    public static Result success(Object data) {
        return success("操作成功", data);
    }

    public static Result success(String msg) {
        return success(msg, null);
    }

    public static Result success(String msg, Object data) {
        Result result = new Result();
        result.setCode(ResponseStatusEnum.SUCCESS.getCode());
        result.setSuccess(true);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result failure(String msg) {
        return failure(msg, null);
    }

    public static Result failure(String msg, Object data) {
        Result result = new Result();
        result.setCode(ResponseStatusEnum.FAIL.getCode());
        result.setSuccess(false);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


    public static Result notLogin() {
        return notLogin("用户未登录");
    }


    public static Result notLogin(String msg) {
        Result result = new Result();
        result.setCode(ResponseStatusEnum.UN_LOGINED.getCode());
        result.setSuccess(false);
        result.setMsg(msg);
        return result;
    }


    /**
     * 数据已存在
     *
     **/
    public static Result exists(String msg, Object data) {
        Result result = new Result();
        result.setCode(ResponseStatusEnum.EXISTS.getCode());
        result.setSuccess(false);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    /**
     * 数据不存在
     *
     **/
    public static Result notExists(String msg) {
        Result result = new Result();
        result.setCode(ResponseStatusEnum.NOT_EXISTS.getCode());
        result.setSuccess(false);
        result.setMsg(msg);
        return result;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
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

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", success=" + success +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
