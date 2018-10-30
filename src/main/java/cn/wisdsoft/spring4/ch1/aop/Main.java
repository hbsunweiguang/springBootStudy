package cn.wisdsoft.spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>ClassName: Main</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 10:22
 */
public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        //读取AopConfig配置类
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        //通过配置类获取DemoAnnotationService对象
        DemoAnnotationService demoAnnotationService =
                context.getBean(DemoAnnotationService.class);
        //通过配置类获取DemoMethodService对象
        DemoMethodService demoMethodService =
                context.getBean(DemoMethodService.class);
        //调用demoAnnotationService的add方法
        demoAnnotationService.add();
        //调用demoMethodService的方法
        demoMethodService.add();
        context.close();
    }
}
