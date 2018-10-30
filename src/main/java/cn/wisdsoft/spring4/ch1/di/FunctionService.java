package cn.wisdsoft.spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * <p>ClassName: FunctionService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 20:20
 */
@Service
public class FunctionService {

    public FunctionService() {
    }

    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
