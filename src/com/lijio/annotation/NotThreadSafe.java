package com.lijio.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 表示一个类是非线程安全的
 */
@Documented  
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)  
public @interface NotThreadSafe {

}
