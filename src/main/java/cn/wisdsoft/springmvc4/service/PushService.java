package cn.wisdsoft.springmvc4.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * <p>ClassName: PushService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 16:56
 */
@Service
public class PushService {
    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAsyncUpdate(){
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    //在PushService里产生DeferredResult给控制器使用，通过Scheduled注解的方法定时更新DeferredResult
    @Scheduled(fixedDelay = 5000)
    public void refresh(){
        if (deferredResult != null){
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }
}
