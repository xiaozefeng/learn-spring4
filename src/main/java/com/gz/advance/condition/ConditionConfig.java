package com.gz.advance.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaozefeng
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(MacCondition.class)
    public ListService macListService() {
        return new MacListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxService() {
        return new LinuxListSerice();
    }
}
