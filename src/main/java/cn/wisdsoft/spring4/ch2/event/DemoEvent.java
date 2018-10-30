package cn.wisdsoft.spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * <p>ClassName: DemoEvent</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 16:09
 */
public class DemoEvent extends ApplicationEvent {

    private static final  long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
