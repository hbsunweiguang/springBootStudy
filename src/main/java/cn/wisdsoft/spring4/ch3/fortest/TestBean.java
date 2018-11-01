package cn.wisdsoft.spring4.ch3.fortest;

/**
 * <p>ClassName: TestBean</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/1 21:39
 */
public class TestBean {
    private String context;

    public TestBean(String context){
        super();
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
