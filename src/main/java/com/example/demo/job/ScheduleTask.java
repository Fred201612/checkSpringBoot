package com.example.demo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


@Component // 把此类托管给 Spring，不能省略
public class ScheduleTask {


    // 添加定时任务
    @Scheduled(cron = "0 37 12 ? * *") // cron 表达式，每周五 23:59:59 执行
    public void doTask(){
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String dateName = df.format(calendar.getTime());
        System.out.println("我是定时任务~" + dateName);
    }
}