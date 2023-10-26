package com.atguigu.common.exception;

public enum BizcodeEnume {

    UNKNOWN_EXPECTION(10000, "系统未知异常"),

    VAILD_EXPECTION(10001, "参数格式校验失败");

    private int code;
    private String msg;

    BizcodeEnume(int code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
