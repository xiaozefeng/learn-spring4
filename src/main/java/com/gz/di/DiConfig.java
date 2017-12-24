package com.gz.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 使用@Service @Component @Repository @Controller 方式将将对象放入容器
 * @author xiaozefeng
 */
@Configuration
@ComponentScan("com.gz.di")
public class DiConfig {
}
