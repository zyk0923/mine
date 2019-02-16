package com.oc.mine.base.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 说明：此注解用于获取当前逻辑所需要的mapper的namespace 
 * 没有此注解会导致无法找到对应的mapper 
 * 
 * 位置：serviceImpl层
 * @author 98051
 *
 */
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MapperNamespace {
	
	String value();
}
