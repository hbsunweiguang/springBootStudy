package cn.wisdsoft.springmvc4;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * <p>ClassName: WebInitializer</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/2 11:11
 */
//WebApplicationInitializer是Spring提供用来配置Servlet3.0配置的接口，从而实现了替代web.xml的位置
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.register(MyMvcConfig.class);
        //新建WebApplicationContext，注册配置类，并将其和当前的servletContext关联
        ctx.setServletContext(servletContext);

        //解决中文乱码的filter
        javax.servlet.FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encodingFilter",CharacterEncodingFilter.class);
        encodingFilter.setInitParameter("forceEncoding", "true");
        encodingFilter.setInitParameter("encoding","UTF-8");
        encodingFilter.addMappingForUrlPatterns(null,true,"/*");

        //注册Spring MVC的DisparcherServlet
        Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
