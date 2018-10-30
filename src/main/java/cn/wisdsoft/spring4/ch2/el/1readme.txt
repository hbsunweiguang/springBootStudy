该包下为EL和资源调用内容
    EL-Spring表达式，支持xml和注解使用
    Spring开发中调用各种资源
    注解@Value使用

    1、首先在pom.xml中配置commons-io包内容
    2、在el包下新建一个test.txt文件，简单写一些内容
    3、在el包下新建一个test.properties文件，内容随意
    4、需要注入的Bean
    5、演示配置类
        a) 在ElConfig配置类中的注释7中：注入配置配件使用@propertySource指定文件地址，若使用@Value注入，
        则要配置一个PropertySourcesPlaceholderConfigurer的Bean。注意，@Value("${book.name}")使用的是“$”，
        而不是“#”
        b) 注入Properties还可从Environment中获得
    6、运行类
        运行时，可能报错，说没有找到资源
        在pom.xml文件中添加
            <resources>
              <resource>
                <directory>src/main/java</directory>
                <includes>
                  <include>**/*.*</include>
                </includes>
              </resource>
            </resources>