package com.gz.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xiaozefeng
 */
@Configuration
@ComponentScan("com.gz.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
