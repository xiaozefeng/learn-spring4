package com.gz.advance.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiaozefeng
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次" + DATE_FORMAT.format(new Date()));
    }
}
