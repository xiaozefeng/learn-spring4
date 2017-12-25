package com.gz.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 切面
 * @Aspect 声明是一个切面
 * @Component 让这个切面注册为Spring 的一个bean
 *
 */
@Aspect
@Component
public class LogAspect {
    /**
     * 声明切点
     */
    @Pointcut("@annotation(com.gz.aop.Action)")
    public void annotationPointCut() {
    }

    /**
     * 声明一个建言 并使用@Pointcut 定义的切点
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截" + action.name());
    }

    /**
     * 声明一个建言，此建言直接使用拦截规则作为参数
     * @param joinPoint
     */
    @Before(value = "execution(* com.gz.aop.*.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截" + method.getName());
    }
}
