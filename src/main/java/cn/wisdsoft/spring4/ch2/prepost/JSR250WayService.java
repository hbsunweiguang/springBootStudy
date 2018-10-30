package cn.wisdsoft.spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <p>ClassName: JSR250WayService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 15:15
 */
public class JSR250WayService {

    @PostConstruct  //在构造函数执行完之后执行
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy //在Bean销毁之前执行
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
