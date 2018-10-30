package cn.wisdsoft.spring4.ch1.di.javaconfig;

/**
 * <p>ClassName: UseFunctionService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 20:38
 */
public class UseFunctionService {

    public UseFunctionService() {
    }

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
