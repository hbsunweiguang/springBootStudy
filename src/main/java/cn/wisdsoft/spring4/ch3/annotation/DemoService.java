package cn.wisdsoft.spring4.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * <p>ClassName: DemoService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/1 21:11
 */
@Service
public class DemoService {

    public  void outputResult() {
        System.out.println("从组合注解配置照样获得的Bean");
    }
}
