package com.robertramirez.springapp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAspect {
    
    //JoinPoint is a specific time
    //Pointcut: @annotation(com.robertramirez.springapp.aop.TimeMonitor)
    // logTime method will be executed for all annotated methods with TimeMonitor
    @Around("@annotation(com.robertramirez.springapp.aop.TimeMonitor)")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        //Bussiness Logic
        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " takes: " + executionTime + " ms");
        return proceed;
    }
}
