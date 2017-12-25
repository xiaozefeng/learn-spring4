package com.gz.advance.annotaion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 自定义注解
 * @ComponentScan @Configuration 作为元注解
 * @author xiaozefeng
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface CustomizedConfiguration {
    String[] value() default {};
}
