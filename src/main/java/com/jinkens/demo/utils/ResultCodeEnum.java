package com.jinkens.demo.utils;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {
    SUCCESS(true, 200,"成功"),
    UNKNOWN_REASON(false, 400, "未知错误");

    private Boolean success;

    private Integer code;

    private String message;

    private ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
