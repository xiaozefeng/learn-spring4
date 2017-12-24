package com.gz.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解被拦截类
 *
 * @author xiaozefeng
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add() {
    }
}
