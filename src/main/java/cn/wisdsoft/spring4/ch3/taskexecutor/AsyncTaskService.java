package cn.wisdsoft.spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <p>ClassName: AsyncTaskService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 20:29
 */
@Service
public class AsyncTaskService {

    @Async  //通过@Async注解声明该方法为异步方法，如果注解在类级别，则表明该类的所有方法都是异步方法。
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务："+i);
    }

    @Async  //在这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1："+(i+1));
    }
}
