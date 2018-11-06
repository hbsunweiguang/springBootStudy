package cn.wisdsoft.springmvc4.web.ch4_4;

import cn.wisdsoft.springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>ClassName: AdivceControler</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 13:16
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) throws Exception {
        System.out.println(obj.getId());
        throw  new Exception("非常抱歉，参数有误/"+"来自@ModelAttribute："+msg);
    }
}
