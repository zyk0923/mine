package com.oc.mine.base.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oc.mine.base.common.CommonThreadLocal;
import com.oc.mine.base.dao.BaseDao;
import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.base.ResultPageEntity;

@Repository
public class BaseDaoImpl implements BaseDao {
	private final SqlSessionTemplate sqlSessionTemplate;

	public BaseDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int insert(Object obj) {
		return sqlSessionTemplate.insert(getMapperNamespace() + "insert", obj);
	}

	@Override
	public int insert(String statement, Object obj) {
		return this.sqlSessionTemplate.insert(getMapperNamespace() + statement, obj);
	}

	@Override
	public int update(Object obj) {
		return this.sqlSessionTemplate.update(getMapperNamespace() + "update", obj);
	}

	@Override
	public int update(String statement, Object obj) {
		return this.sqlSessionTemplate.update(getMapperNamespace() + statement, obj);
	}

	@Override
	public int delete(Object obj) {
		return this.sqlSessionTemplate.delete(getMapperNamespace() + "delete", obj);
	}

	@Override
	public int delete(String statement, Object obj) {
		return this.sqlSessionTemplate.delete(getMapperNamespace() + statement, obj);
	}

	@Override
	public int deleteAll(Object[] obj) {
		return this.sqlSessionTemplate.delete(getMapperNamespace() + "deleteAll", obj);
	}

	@Override
	public ResultPageEntity listPage(Object obj, int pageNo, int pageSize) {

		PageHelper.startPage(pageNo, pageSize);
		PageInfo<Object> pageInfo = new PageInfo<Object>(
				this.sqlSessionTemplate.selectList(getMapperNamespace() + "list", obj));
		ResultPageEntity pageEntity = new ResultPageEntity();
		pageEntity.setObj(pageInfo.getList());
		pageEntity.setPageNo(pageInfo.getPageNum());
		pageEntity.setPageSize(pageInfo.getPageSize());
		pageEntity.setTotal((int) pageInfo.getTotal());
		return pageEntity;
	}

	@Override
	public <T> ResultPageEntity listPage(GetPageEntity<T> entity) {
		return listPage(entity.getEntity(), entity.getPageNo(), entity.getPageSize());
	}

	@Override
	public ResultPageEntity listPage(Object obj) {
		return listPage(obj, 1, 10);
	}

	@Override
	public <T> List<T> list(Object obj) {
		return this.sqlSessionTemplate.selectList(getMapperNamespace() + "list", obj);
	}

	@Override
	public <T> List<T> findForList(String statement, Object obj) {
		return this.sqlSessionTemplate.selectList(getMapperNamespace() + statement, obj);
	}

	@Override
	public <T> T findForObject(String statement, Object obj) {
		return this.sqlSessionTemplate.selectOne(getMapperNamespace() + statement, obj);
	}

	@Override
	public int getDuplicateCount(Object obj) {
		return this.sqlSessionTemplate.selectOne(getMapperNamespace() + "getDuplicateCount", obj);
	}

	public String getMapperNamespace() {
		String string = CommonThreadLocal.mybatisStatement.get().get(0);
		return string + ".";
	}

}
