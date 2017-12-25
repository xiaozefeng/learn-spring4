package com.gz.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaozefeng
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingleService singleService1 = context.getBean(DemoSingleService.class);
        DemoSingleService singleService2 = context.getBean(DemoSingleService.class);
        System.out.println(singleService1 == singleService2);

        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);
        System.out.println(demoPrototypeService1 == demoPrototypeService2);
    }
}
