package cn.wisdsoft.spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * <p>ClassName: ConditionConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/1 20:59
 */
@Configuration
@ComponentScan("cn.wisdsoft.spring4.ch3.conditional")
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)    //通过Conditional注解，符合Windows条件则实例化windowsListService
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)  //通过Conditional注解，符合Linux条件则实例化linuxListService
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
