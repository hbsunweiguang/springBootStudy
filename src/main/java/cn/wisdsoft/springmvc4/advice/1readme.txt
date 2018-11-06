    通过@ControllerAdvice，我们可以将对于控制器的全局配置放置在同一个位置，注解了@Controller的类的方法可使用
@ExceptionHandler、@ModelAttribute、@InitBinder注解到方法上，这些所有注解了@RequestMapping的控制器内的方法有效

    @ExceptionHandler：用于全局处理控制器里的异常。
    @InitBinder：用于设置WebDataBinder，WebDataBinder用来自动绑定前台请求参数到Model中。
    @ModelAttribute：@ModelAttribute本来的作用是绑定键值对到Model里，此处是让全局的@RequestMapping都能获得
    在此处设置的键值对。