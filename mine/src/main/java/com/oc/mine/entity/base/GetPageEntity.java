package com.oc.mine.entity.base;

public class GetPageEntity<T> extends BasePageEntity{

	private T entity;

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}
}
