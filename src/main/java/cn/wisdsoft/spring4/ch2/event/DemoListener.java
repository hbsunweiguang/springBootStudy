package cn.wisdsoft.spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>ClassName: DemoListener</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 16:12
 */
//实现ApplicationListener接口，并制定监听的事件类型
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    //使用onApplicationEvent方法对消息进行接受处理
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();

        System.out.println("我（Bean-demoListener）接收到了bean-demoPublisher发布的消息是："+msg);
    }
}
