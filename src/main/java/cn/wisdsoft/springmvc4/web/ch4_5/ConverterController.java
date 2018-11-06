package cn.wisdsoft.springmvc4.web.ch4_5;

import cn.wisdsoft.springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>ClassName: ConverterController</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 15:28
 */
@Controller
public class ConverterController {

    @RequestMapping( value = "/convert", produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
