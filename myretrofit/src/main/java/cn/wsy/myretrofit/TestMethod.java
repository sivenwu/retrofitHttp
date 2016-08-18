package cn.wsy.myretrofit;

/**
 * 注解测试
 * Created by wsy on 2016/8/18.
 */
public @ interface TestMethod {

     boolean isResult() default false;

     String function1();

     int function2();

}
