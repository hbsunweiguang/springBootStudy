package cn.wisdsoft.spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * <p>ClassName: DemoMethodService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/29 21:23
 */
@Service
public class DemoMethodService {

    public DemoMethodService() {
    }

    public void add(){
        System.out.println("add方法");
    }
}
