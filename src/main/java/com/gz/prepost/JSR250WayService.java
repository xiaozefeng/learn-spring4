package com.gz.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author xiaozefeng
 * @PostConstruct 在构造函数执行后执行
 * @PreDestroy 在Bean销毁之前执行
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        System.out.println("构造函数初始化-jsr250WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }

}
