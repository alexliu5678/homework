package com.liu.ucenter.web;

import lombok.Getter;

@Getter
public enum ResultCode implements StatusCode{
    SUCCESS("1000", "request success"),
    FAILED("1001", "request fail"),
    VALIDATE_ERROR("1002", "param check fail"),
    RESPONSE_PACK_ERROR("1003", "response pack error");


    private String code;
    private String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String code() {
        return code;
    }

}
