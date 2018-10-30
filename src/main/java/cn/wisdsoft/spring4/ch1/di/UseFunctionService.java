package cn.wisdsoft.spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>ClassName: UseFunctionService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 20:23
 */
@Service    //注解  当前类注入到Spring管理成一个Bean
public class UseFunctionService {

    public UseFunctionService() {
    }

    @Autowired  //自动注入把FunctionService注入到对象中
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
