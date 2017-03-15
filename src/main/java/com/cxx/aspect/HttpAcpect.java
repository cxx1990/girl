package com.cxx.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

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
    public void doBefor(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("URl={}",request.getRequestURL());
        logger.info("method={}",request.getMethod());
        logger.info("IP={}",request.getRemoteAddr());
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+">"+joinPoint.getSignature().getName());
      logger.info("args={}",joinPoint.getArgs());

    }

    @After("log()")
    public void doAfter(){
        logger.info("3333333333");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("responde={}",object.toString());
    }
}
