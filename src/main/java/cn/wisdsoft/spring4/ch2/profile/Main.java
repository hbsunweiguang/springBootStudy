package cn.wisdsoft.spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>ClassName: Main</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 15:46
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        //先将活动的Profile设置未prod
        context.getEnvironment().setActiveProfiles("prod");
        //后置注册Bean配置类，不然会报Bean未定义的错误
        context.register(ProfileConfig.class);
        //刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();

    }
}
