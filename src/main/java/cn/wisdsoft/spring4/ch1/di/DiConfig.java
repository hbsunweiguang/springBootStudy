package cn.wisdsoft.spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>ClassName: DiConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 20:30
 */
@Configuration      //声明当前类是一个配置类，相当于Spring的xml文件
@ComponentScan("cn.wisdsoft.spring4.ch1.di")    //自动扫描包名下所有的@Service、@Component、@Repository和@Controller的类，并注册为Bean
public class DiConfig {

    public DiConfig() {
    }
}
