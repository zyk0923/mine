package com.oc.mine.base.common;

import java.util.ArrayList;

public class CommonThreadLocal {
	/**
	 * mybatis的statement
	 */
	public static ThreadLocal<ArrayList<String>> mybatisStatement = new ThreadLocal<ArrayList<String>>();
	

	/**
	 * 登录用户session
	 */
//	public static ThreadLocal<Operator> loginSysUserThreadLocal = new ThreadLocal<Operator>();
}
