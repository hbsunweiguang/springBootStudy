package cn.wisdsoft.spring4.ch2.profile;

/**
 * <p>ClassName: DemoBean</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/10/30 15:41
 */
public class DemoBean {

    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
