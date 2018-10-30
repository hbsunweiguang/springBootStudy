package cn.wisdsoft.spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>ClassName: Main</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 14:12
 */
public class Main {

    public Main() {
    }

    public static void main(String [] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputResource();

        context.close();
    }
}
