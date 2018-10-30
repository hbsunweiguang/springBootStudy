package cn.wisdsoft.spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * <p>ClassName: ElConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 11:07
 */
@Configuration
@ComponentScan("cn.wisdsoft.spring4.ch2.el")
@PropertySource("classpath:cn/wisdsoft/spring4/ch2/el/test.properties") //7注入配置文件
public class ElConfig {

    public ElConfig() {
    }

    //注入普通字符串
    @Value("I Love You!")
    private String normal;

    //注入操作系统的属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //注入表达式结果
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    //注入其他Bean属性
    @Value("#{demoService.another}")
    private String fromAnother;

    //注入文件资源
    @Value("classpath:cn/wisdsoft/spring4/ch2/el/test.txt")
    private Resource testFile;

    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;

    //7注入配置文件资源
    @Value("${book.name}")
    private String bookName;

    //7
    @Autowired
    private Environment environment;

    //7
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            //IOUtils是commons-io包中的工具类，转换
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
