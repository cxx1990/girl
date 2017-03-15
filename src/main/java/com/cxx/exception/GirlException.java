package com.cxx.exception;

import com.cxx.enums.ResultEnum;

/**
 * Created by chenxiangxiang on 2017/3/15.
 */

public class GirlException extends RuntimeException {

    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.status = resultEnum.getStatus();
    }
}
