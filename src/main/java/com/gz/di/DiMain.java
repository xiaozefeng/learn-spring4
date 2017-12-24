package com.gz.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 依赖注入
 * @author xiaozefeng
 */
public class DiMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        String result = bean.sayHello("world");
        System.out.println(result);
    }
}
