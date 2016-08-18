package cn.wsy.myretrofit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模仿注入view id
 * Created by wsy on 2016/8/18.
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)//表示在生命周期是运行时
public @interface ViewInject {

    int value() default  -1;
}


