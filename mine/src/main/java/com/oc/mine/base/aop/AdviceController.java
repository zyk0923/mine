package com.oc.mine.base.aop;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.oc.mine.base.exception.BusinessException;
import com.oc.mine.entity.base.ResultEntity;


@RestControllerAdvice
public class AdviceController {
	@ExceptionHandler(value = {BusinessException.class})
	public ResultEntity executeBusinessException(BusinessException ex) {
		ResultEntity resultEntity = new ResultEntity();
		resultEntity.setStatus(false);
		String err = ex.getMessage();
		if(!"".equals(err)){
			resultEntity.setErrMsg(err);
		}
		
		return resultEntity;
	}
}
