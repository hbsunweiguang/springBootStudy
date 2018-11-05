package cn.wisdsoft.springmvc4.domain;

/**
 * <p>ClassName: DemoObj</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/5 20:57
 */
public class DemoObj {

    private Long id;
    private String name;

    //jackson对象和json对象转换是一定需要无参构造
    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
