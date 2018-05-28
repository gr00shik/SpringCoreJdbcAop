package com.gr00shik.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.gr00shik.dao.utils.PurchaseJDBCTemplate.*(..))")
    private void logMyWork(){}

    @Before("logMyWork()")
    public void log(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName());
}


}
