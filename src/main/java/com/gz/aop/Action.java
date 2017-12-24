package com.gz.aop;

import java.lang.annotation.*;

/**
 * 注解本身是没用功能的，注解的功能来自于用这个注解的地方
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
