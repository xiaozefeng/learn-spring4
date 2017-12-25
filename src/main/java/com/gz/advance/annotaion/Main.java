package com.gz.advance.annotaion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaozefeng
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomizedConfig.class);
        CustomizedService customizedService = context.getBean(CustomizedService.class);
        customizedService.sayHello();

    }
}
