package cn.wisdsoft.spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>ClassName: PrePostConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 15:18
 */
@Configuration
@ComponentScan("cn.wisdsoft.spring4.ch2.prepost")
public class PrePostConfig {

    //initMethod和destroyMethod指定BeanWayService的init和destroy方法在构造方法之后、Bean销毁之前执行
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
