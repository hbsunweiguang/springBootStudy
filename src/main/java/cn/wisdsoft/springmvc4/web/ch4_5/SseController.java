package cn.wisdsoft.springmvc4.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * <p>ClassName: SseController</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 15:54
 */
//服务器端推送技术
@Controller
public class SseController {

    //注意，此处使用输出的媒体类型为text/event-stream，这是服务器端SSE的支持，本案例每5秒向浏览器随机消息。
    @RequestMapping(value = "/push",produces = "text/event-stream;charset=UTF-8")
    public @ResponseBody String push(){
        Random r = new Random();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + r.nextInt() + "\n\n";
    }
}
