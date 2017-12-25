package com.gz.advance.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaozefeng
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        String result = listService.showListCmd();
        System.out.println(result);
    }
}
