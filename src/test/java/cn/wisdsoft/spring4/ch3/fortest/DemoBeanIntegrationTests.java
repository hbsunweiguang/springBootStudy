package cn.wisdsoft.spring4.ch3.fortest;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>ClassName: DemoBeanIntegrationTests</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/1 21:45
 */
@RunWith(SpringJUnit4ClassRunner.class) //SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class}) //ContextConfiguration用来加载配置ApplicationContext，其中classes属性用来加载配置类
@ActiveProfiles("prod") //ActiveProfiles 用来声明活动的profile
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

//    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContext();
        Assert.assertEquals(expected,actual);
    }
}
