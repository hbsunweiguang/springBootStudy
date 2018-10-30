package cn.wisdsoft.spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <p>ClassName: ProfileConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 15:43
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")     //配置dev
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")    //配置prod
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }
}
