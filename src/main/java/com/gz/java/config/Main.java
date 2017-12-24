package com.gz.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaozefeng
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseUserService bean = context.getBean(UseUserService.class);
        String result = bean.sayHi("Java");
        System.out.println(result);
    }
}
