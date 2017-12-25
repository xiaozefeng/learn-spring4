package com.gz.advance.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xiaozefeng
 */
@Configuration
@ComponentScan("com.gz.advance.schedule")
@EnableScheduling
public class TaskSchedulerConfig {
}
