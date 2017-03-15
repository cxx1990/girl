package com.cxx.utils;

import com.cxx.enums.ResultEnum;

/**
 * Created by chenxiangxiang on 2017/3/15.
 */
public class ResultUtil {


    public static ResultMessage success(Object object){
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setStatus(ResultEnum.SUCCESS.getStatus());
        resultMessage.setMsg(ResultEnum.SUCCESS.getMsg());
        resultMessage.setData(object);
        return  resultMessage;
    }

    public static ResultMessage success(){
        return success(null);
    }


    public  static  ResultMessage error(Integer status,String msg){
        ResultMessage resultMessage= new ResultMessage();
        resultMessage.setStatus(status);
        resultMessage.setMsg(msg);
       return  resultMessage;
    }

}
