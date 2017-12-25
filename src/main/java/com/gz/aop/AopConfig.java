package com.gz.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xiaozefeng
 * @EnableAspectJAutoProxy 开启Spring 对AspectJ 的支持
 */
@Configuration
@ComponentScan("com.gz.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
