package cn.wisdsoft.spring4.ch2.scope;

import org.springframework.stereotype.Service;

/**
 * <p>ClassName: DemoSingletonService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 10:32
 */
@Service    //不写@Scope默认为Singleton，相当于@Scope("singleton")
public class DemoSingletonService {

    public DemoSingletonService() {
    }
}
