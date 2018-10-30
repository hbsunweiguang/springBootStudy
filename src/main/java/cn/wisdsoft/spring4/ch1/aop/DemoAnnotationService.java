package cn.wisdsoft.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * <p>ClassName: DemoAnnotationService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 21:21
 */
@Service
public class DemoAnnotationService {

    public DemoAnnotationService() {
    }

    @Action(name = "注解式拦截的add操作")
    public void add(){
        System.out.println("add注解");
    }
}
