package cn.wisdsoft.springmvc4.web.ch4_5;

import cn.wisdsoft.springmvc4.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * <p>ClassName: AysncController</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 16:55
 */
@Controller
public class AysncController {
    @Autowired
    PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }
}
