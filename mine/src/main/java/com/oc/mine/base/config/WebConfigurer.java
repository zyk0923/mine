package com.oc.mine.base.config;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 项目配置
 * @author 98051
 *
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer{
	
	private static Logger log = LoggerFactory.getLogger(WebConfigurer.class);
	
	/**
	 * 项目初始化加载
	 */
	@PostConstruct
	public void init() {
		log.info("项目启动");
	}
	
	/**
	 * 跨域配置
	 */
	@Override
    public void addCorsMappings(CorsRegistry registry) {
           registry.addMapping("/**")
           .allowedOrigins("http://localhost:4396","http://127.0.0.1:4396")
           .allowedHeaders("*")
           .allowCredentials(true)
           .allowedMethods("GET", "POST", "OPTIONS").maxAge(3600);
    }
}
