package cn.wisdsoft.spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>ClassName: AopConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 10:16
 */
@Configuration
@ComponentScan("cn.wisdsoft.spring4.ch1.aop")
@EnableAspectJAutoProxy //使用@EnableAspectJAutoProxy 注解开启Spring对AspectJ 的支持
public class AopConfig {

    public AopConfig() {
    }
}
