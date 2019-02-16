package com.oc.mine.service.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oc.mine.base.dao.BaseDao;
import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.base.ResultPageEntity;
import com.oc.mine.service.base.BaseService;



public class BaseServiceImpl implements BaseService{

	@Autowired
	protected BaseDao baseDao;
	
	@Override
	public int insert(Object obj) {
		return baseDao.insert(obj);		
	}
	
	@Override
	public void insert(String statement, Object obj) {
		baseDao.insert(statement, obj);		
	}

	@Override
	public void update(Object obj) {
		baseDao.update(obj);
	}

	@Override
	public ResultPageEntity listPage(Object obj, int pageNo, int pageSize) {
		return baseDao.listPage(obj, pageNo, pageSize);
	}

	@Override
	public <T> ResultPageEntity listPage(GetPageEntity<T> entity) {
		return baseDao.listPage(entity);
	}

	@Override
	public ResultPageEntity listPage(Object obj) {
		return baseDao.listPage(obj);
	}
	
	@Override
	public int getDuplicateCount(Object obj) {
		return baseDao.getDuplicateCount(obj);
	}

	@Override
	public void delete(Object obj) {
		baseDao.delete(obj);
	}
	
	@Override
	public void deleteAll(Object[] obj) {
		baseDao.deleteAll(obj);
	}

	@Override
	public <T> List<T> list(Object obj) {
		return baseDao.list(obj);
	}

	@Override
	public <T> List<T> findForList(String statement, Object obj) {
		return baseDao.findForList(statement, obj);
	}
	
	@Override
	public <T> T findForObject(String statement, Object obj) {
		return baseDao.findForObject(statement, obj);
	}

	@Override
	public int delete(String statement, Object obj) {
		return baseDao.delete(statement, obj);
	}
}
