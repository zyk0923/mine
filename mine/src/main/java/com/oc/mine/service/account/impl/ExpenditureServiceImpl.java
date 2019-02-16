package com.oc.mine.service.account.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.oc.mine.base.common.MapperNamespace;
import com.oc.mine.service.account.ExpenditureService;
import com.oc.mine.service.base.impl.BaseServiceImpl;

@Service
@MapperNamespace("Expenditure")
public class ExpenditureServiceImpl extends BaseServiceImpl implements ExpenditureService{

	@Override
	public Integer getThisMonthAmount() {
		return super.findForObject("getMonthAmount", new SimpleDateFormat("yyyyMM").format(new Date()));
	}
}
