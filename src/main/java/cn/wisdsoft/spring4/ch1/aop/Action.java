package cn.wisdsoft.spring4.ch1.aop;

import java.lang.annotation.*;

//@interface注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
