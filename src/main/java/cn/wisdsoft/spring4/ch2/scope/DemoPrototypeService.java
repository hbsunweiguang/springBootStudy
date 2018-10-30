package cn.wisdsoft.spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * <p>ClassName: DemoPrototypeService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 10:34
 */
@Service
@Scope("prototype") //声明Scope为Prototype
public class DemoPrototypeService {

    public DemoPrototypeService() {
    }
}
