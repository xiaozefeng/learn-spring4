package com.gz.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaozefeng
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("hello application event");

        context.close();
    }
}
