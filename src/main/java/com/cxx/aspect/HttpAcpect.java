package com.cxx.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by chenxiangxiang on 2017/3/14.
 * Aop 切面
 */


@Aspect
@Component
public class HttpAcpect {

    private  final static Logger  logger = LoggerFactory.getLogger(HttpAcpect.class);

    /**
     * 将Befor 和After的注解 公用
     */
    @Pointcut("execution(public * com.cxx.controller.GirlController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefor(){

        logger.info("11111111111111");
    }

    @After("log()")
    public void doAfter(){
        logger.info("3333333333");
    }
}
