1、首先在pom.xml配置文件导入jar包cn.wisdsoft.spring4.ch1.aop start

2、编写拦截规则的注解Action
    在这讲下注解，注解本身是没有任何功能的，就和xml一样。注解和xml都是一种元数据，
    元数据即解释数据的数据，这就是所谓的配置。
    注解的功能来自用这个注解的地方。

3、编写使用注解的被拦截类DemoAnnotationService
    注意使用Service注解，并在方法中使用自定义Action注解

4、编写使用方法规则被拦截类DemoMethodService
    注意使用Service注解

5、编写切面LogAspect
    具体操作详见LogAspect.java文件

6、配置类AopConfig
    @EnableAspectJAutoProxy //使用@EnableAspectJAutoProxy 注解开启Spring对AspectJ 的支持

7、运行类Main

