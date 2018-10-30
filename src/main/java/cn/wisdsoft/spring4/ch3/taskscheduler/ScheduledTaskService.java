package cn.wisdsoft.spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>ClassName: ScheduledTaskService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 20:40
 */
@Service
public class ScheduledTaskService {
    private static  final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)    //通过@Scheduled声明该方法为计划任务，使用fixedRate属性每隔固定时间执行
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次 "+dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")  //使用cron属性可按照指定时间执行本案例为每天11点28分
    public void fixTimeExecution() {
        System.out.println("在指定时间 "+dataFormat.format(new Date()) + "执行");
    }
}
