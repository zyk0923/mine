package com.oc.mine.base.aop;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.oc.mine.base.common.NoPackEntity;
import com.oc.mine.entity.base.ResultEntity;


@RestControllerAdvice
public class PackResponseController implements ResponseBodyAdvice<Object>{

	@Override
	public Object beforeBodyWrite(Object arg0, MethodParameter arg1, MediaType arg2,
			Class<? extends HttpMessageConverter<?>> arg3, ServerHttpRequest arg4, ServerHttpResponse arg5) {
		if(arg0 instanceof ResultEntity || arg0 instanceof byte[] || arg0 instanceof NoPackEntity){
			return arg0;
		}
		ResultEntity resultEntity = new ResultEntity();
		resultEntity.setObj(arg0);
		return resultEntity;
	}

	@Override
	public boolean supports(MethodParameter arg0, Class<? extends HttpMessageConverter<?>> arg1) {
		// TODO Auto-generated method stub
		return true;
	}

}
