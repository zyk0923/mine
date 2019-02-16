package com.oc.mine.service.base;

import java.util.List;

import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.base.ResultPageEntity;

public interface BaseService {

	/**
	 * 基础插入
	 * @param obj 数据
	 * @return
	 */
	int insert(Object obj);

	/**
	 * 基础更新
	 * @param obj
	 */
	void update(Object obj);

	/**
	 * 基础分页
	 * @param obj
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	ResultPageEntity listPage(Object obj, int pageNo, int pageSize);

	/**
	 * 基础分页
	 * @param entity
	 * @return
	 */
	<T> ResultPageEntity listPage(GetPageEntity<T> entity);

	/**
	 * 基础分页
	 * @param obj
	 * @return
	 */
	ResultPageEntity listPage(Object obj);

	/**
	 * 基础逻辑删除
	 * @param obj
	 */
	void delete(Object obj);

	/**
	 * 基础查询
	 * @param obj
	 * @return
	 */
	<T> List<T> list(Object obj);

	/**
	 * 基础批量删除
	 * @param obj
	 */
	void deleteAll(Object[] obj);

	/**
	 * 查询参数在数据库中存在的条数
	 * @param obj
	 * @return
	 */
	int getDuplicateCount(Object obj);

	/**
	 * 自定义查询
	 * @param statement
	 * @param obj
	 * @return
	 */
	<T> List<T> findForList(String statement, Object obj);

	/**
	 * 自定义单条查询
	 * @param statement
	 * @param obj
	 * @return
	 */
	<T> T findForObject(String statement, Object obj);

	/**
	 * 自定义插入
	 * @param statement
	 * @param obj
	 */
	void insert(String statement, Object obj);
	
	/**
	 * 自定义删除
	 * @param statement
	 * @param obj
	 * @return
	 */
	int delete(String statement, Object obj);

}
