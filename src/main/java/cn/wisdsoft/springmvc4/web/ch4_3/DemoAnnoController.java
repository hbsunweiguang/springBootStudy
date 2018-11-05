package cn.wisdsoft.springmvc4.web.ch4_3;

import cn.wisdsoft.springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>ClassName: DemoAnnoController</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/5 20:59
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    //此方法未标注路径，因此使用类级别的路径/anno；produces可定制返回response媒体类型和字符集
    // 或需要返回的是json对象，则设置produces="application/json;charset=UTF-8"
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index (HttpServletRequest request){
        //使用HttpServletRequest作为参数，当然可以使用HttpServletResponse作为参数
        return "url:" + request.getRequestURI() + " can access";
    }

    @RequestMapping(value = "pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request){
        //接受路径参数，并在方法参数前结合@PathVariable使用，访问路径为/anno/pathvar/xx
        return "url:" + request.getRequestURI() + " can access,str: "+str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest request) {
        //常规的request参数获取，访问路径为/anno/requestParam?id=1
        return "url:" + request.getRequestURI() + " can access,id: "+id;
    }

    //解释参数到对象，访问路径为/anno/obj?id=1&name=xx
    @RequestMapping(value = "/obj",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj,HttpServletRequest request){
        return "url:" + request.getRequestURI() + "can access obj id: "+obj.getId() +
                "obj name: "+obj.getName();
    }

    //映射不同的路径访问到相同的方法，访问路径为/anno/name1 或 /anno/name2
    @RequestMapping(value = {"/name1","/name2"}, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request){
        return "url:" + request.getRequestURI() + " can access";
    }
}
