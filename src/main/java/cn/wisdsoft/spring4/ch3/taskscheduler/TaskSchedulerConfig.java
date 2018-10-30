package cn.wisdsoft.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>ClassName: TaskSchedulerConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 20:46
 */
@Configuration
@ComponentScan("cn.wisdsoft.spring4.ch3.taskscheduler")
@EnableScheduling   //通过@EnableScheduling注解开启对计划任务的支持。
public class TaskSchedulerConfig {

    public TaskSchedulerConfig() {
    }
}
