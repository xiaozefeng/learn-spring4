package com.gz.prepost;

/**
 * @author xiaozefeng
 */
public class BeanWayService {

    public void  init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        System.out.println("构造函数-beanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }

}
