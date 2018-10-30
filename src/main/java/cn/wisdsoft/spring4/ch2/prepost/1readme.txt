    实际开发的时候，经常会遇到在Bean使用之前或者之后需要做些必要的操作，
    Spring对Bean的生命周期的操作提供了支持。

    1）Java配置方式：使用@Bean的initMethod和destoryMethod
    2）注解方式：利用JSR-250的@PostConstruct和@PreDestroy

    1、首先导入jar包cn.wisdsoft.spring4.ch2.prepost start
    2、BeanWayService是使用@Bean形式的Bean