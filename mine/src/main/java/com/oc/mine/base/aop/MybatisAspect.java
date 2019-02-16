package com.oc.mine.base.aop;

import java.util.ArrayList;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.oc.mine.base.common.CommonThreadLocal;
import com.oc.mine.base.common.MapperNamespace;



@Aspect
@Component
public class MybatisAspect {
	
	@Pointcut("execution (* com.oc.mine.service..impl.*.*(..))")
	public void execute(){}
	
	@Before("execute()")
	public void doBefore(JoinPoint joinPoint) throws Throwable{
		Class<? extends Object> class1 = joinPoint.getTarget().getClass();
		MapperNamespace annotation = class1.getAnnotation(MapperNamespace.class);
		if(annotation == null) {
			throw new Exception(class1.getName() + "未设置MapperNamespace注解");
		}
		if(CommonThreadLocal.mybatisStatement.get() == null) {
			ArrayList<String> arrayList = new ArrayList<String>(5);
			arrayList.add(0,annotation.value());
			CommonThreadLocal.mybatisStatement.set(arrayList);
		}else {
			CommonThreadLocal.mybatisStatement.get().add(0, annotation.value());
		}
		
	}
	
	@After("execute()")
	public void doAfter(JoinPoint joinPoint) throws Throwable{
		if(CommonThreadLocal.mybatisStatement.get() == null) {
			return;
		}
		try {
			CommonThreadLocal.mybatisStatement.get().remove(0);
		}catch(NullPointerException e) {
			System.out.println("删除失败");
		}
	}
}