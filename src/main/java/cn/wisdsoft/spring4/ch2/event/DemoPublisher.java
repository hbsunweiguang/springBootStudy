package cn.wisdsoft.spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <p>ClassName: DemoPublisher</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 16:16
 */
@Component
public class DemoPublisher {

    //注入ApplicationContext用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public  void publish(String msg){
        //使用appliactionContext的publishEvent方法来发布
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
