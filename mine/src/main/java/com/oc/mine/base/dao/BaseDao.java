package com.oc.mine.base.dao;

import java.util.List;

import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.base.ResultPageEntity;

public interface BaseDao {

	/**
	 * 基础插入方法 xml方法名默认为insert
	 * @param obj 
	 * @return 
	 */
	int insert(Object obj);
	/**
	 * 自定义插入方法
	 * @param statement xml方法名
	 * @param obj 查询对象
	 * @return
	 */
	int insert(String statement, Object obj);
	/**
	 * 基础更新方法
	 * @param obj 查询对象
	 * @return
	 */
	int update(Object obj);
	
	/**
	 * 自定义更新方法
	 * @param statement xml方法名
	 * @param obj 查询对象
	 * @return
	 */
	int update(String statement, Object obj);

	/**
	 * 基础删除方法
	 * @param obj 查询对象
	 * @return
	 */
	int delete(Object obj);
	
	/**
	 * 基础批量删除方法
	 * @param obj 查询对象
	 * @return
	 */
	int deleteAll(Object[] obj);
	int delete(String statement, Object obj);
	
	/**
	 * 基础查询分页数据 默认分页10查询第一页 xml方法名默认为list
	 * @param obj 查询对象
	 * @return 封装好的分页数据
	 */
	ResultPageEntity listPage(Object obj);
	
	/**
	 * 基础查询分页数据 xml方法名默认为list
	 * @param obj 查询对象
	 * @param pageNo 页码
	 * @param pageSize 每页数据量
	 * @return
	 */
	ResultPageEntity listPage(Object obj, int pageNo, int pageSize);
	
	/**
	 * 基础查询分页数据 xml方法名默认为list
	 * @param entity 封装好的查询对象
	 * @return
	 */
	<T> ResultPageEntity listPage(GetPageEntity<T> entity);
	
	/**
	 * 基础查询数据 xml方法名默认为list
	 * @param obj 封装好的查询对象
	 * @return
	 */
	<T> List<T> list(Object obj);
	
	/**
	 * 自定义查询数据
	 * @param statement xml方法名
	 * @param obj 查询对象
	 * @return List数组
	 */
	<T> List<T> findForList(String statement, Object obj);
	
	/**
	 * 自定义查询一条数据
	 * @param statement xml方法名
	 * @param obj 查询对象
	 * @return 查询到的数据
	 */
	<T> T findForObject(String statement, Object obj);
	
	/**
	 * 查询是否存在相关数据 xml方法名默认为getDuplicateCount
	 * @param obj 查询对象
	 * @return 查询到的个数
	 */
	int getDuplicateCount(Object obj);
}
