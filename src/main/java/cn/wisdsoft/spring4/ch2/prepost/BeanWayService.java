package cn.wisdsoft.spring4.ch2.prepost;

/**
 * <p>ClassName: BeanWayService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 15:11
 */
public class BeanWayService {

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public void destroy(){
        System.out.println("@Bean-destory-method");
    }
}
