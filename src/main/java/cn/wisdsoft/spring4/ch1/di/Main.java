package cn.wisdsoft.spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>ClassName: Main</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 20:32
 */
public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        //读取配置类
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        //获取配置类中扫描的UseFunctionService类
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("helloworld"));
        context.close();
    }
}
