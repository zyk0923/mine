package com.oc.mine.base.config;

import java.util.List;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

/**
 * 用于解决springboot mybatis 配置mapper时因未使用注解方式配置mapper
 * 从而导致的 'No MyBatis mapper was found in' 警告解决方法 重写扫描
 * 类 不再扫描 使用注解方式配置mapper时请关闭此类
 * @author 98051
 *
 */
@Configuration
public class MapperNoWarn extends MybatisAutoConfiguration{

	public MapperNoWarn(MybatisProperties properties, ObjectProvider<Interceptor[]> interceptorsProvider,
			ResourceLoader resourceLoader, ObjectProvider<DatabaseIdProvider> databaseIdProvider,
			ObjectProvider<List<ConfigurationCustomizer>> configurationCustomizersProvider) {
		super(properties, interceptorsProvider, resourceLoader, databaseIdProvider, configurationCustomizersProvider);
		// TODO Auto-generated constructor stub
	}
}
