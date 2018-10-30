package cn.wisdsoft.spring4.ch1.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>ClassName: JavaConfig</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 20:44
 */
@Configuration  //配置类，这意味这个类里有可能有0或多个@Bean，此处没有扫描，因为所有类Bean都在此类定义了
public class JavaConfig {

    public JavaConfig() {
    }

    @Bean   //使用@Bean注解声明该方法FunctionService的返回一个Bean，Bean的名称是方法名
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        //注入UseFunctionService的Bean时候直接调用functionService()
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

//另外的一种注入方式，直接将FunctionService作为参数给useFunctionService()，Spring容器提供的极高功能。
//在Spring容器中，只要容器中存在某个Bean，就可以在另外的一个Bean的声明方法的参数中注入
//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }
}
