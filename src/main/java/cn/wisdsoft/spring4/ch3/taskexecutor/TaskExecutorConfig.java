package cn.wisdsoft.spring4.ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * <p>ClassName: TaskExecutorConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 20:20
 */
@Configuration
@ComponentScan("cn.wisdsoft.spring4.ch3.taskexecutor")
@EnableAsync    //利用@EnableAsync注解开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer { //2配置类需要实现AsyncConfigurer接口
    @Override
    public Executor getAsyncExecutor() {//重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

}
