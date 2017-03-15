package com.cxx.handle;

import com.cxx.exception.GirlException;
import com.cxx.utils.ResultMessage;
import com.cxx.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenxiangxiang on 2017/3/15.
 */
@ControllerAdvice
public class HandleException {
    private  final static Logger logger = LoggerFactory.getLogger(HandleException.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultMessage returnHandle(Exception e) {

        if (e instanceof GirlException){
            return  ResultUtil.error(((GirlException) e).getStatus(),e.getMessage());
        }

        logger.info("[系统异常]",e);
       return ResultUtil.error(-100,"未知错误！");
    }

}
