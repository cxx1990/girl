package com.cxx.enums;

/**
 * Created by chenxiangxiang on 2017/3/15.
 */
public enum ResultEnum {
    UNKONW_ERROR(-400,"未知错误"),
    SMALL_ERROR(-101,"我猜还在上小学吧？"),
    HIIGH_ERROR(-102,"你还在上初中吧？"),
    SUCCESS(100,"成功");


    private Integer status;
    private String  msg;

    ResultEnum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getStatus() {
        return status;
    }
}
