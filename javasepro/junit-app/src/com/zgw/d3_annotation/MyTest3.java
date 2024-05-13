package com.zgw.d3_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) // 当前被修饰的注解只能用在类和方法上
@Retention(RetentionPolicy.RUNTIME) // 声明注解的保留周期
public @interface MyTest3 {
}
