package cn.wisdsoft.springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>ClassName: ExceptionHandlerAdvice</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 12:55
 */
//ControllerAdvice声明一个控制器建言，组合了Component注解，所以自动注册位Spring的Bean
@ControllerAdvice
public class ExceptionHandlerAdvice {

    //在此处定义全局处理，通过ExceptionHandler的value属性可过滤拦截的条件，此处我们拦截所有的Exception
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    //此处使用ModelAttribute注解将键值对添加到全局，所有注解的RequestMapping的方法可获得此键值对
    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息");
    }

    //通过InitBinder注解定制WebDataBinder
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        //此处演示忽略request参数的id。。。
        webDataBinder.setDisallowedFields("id");
    }
}
