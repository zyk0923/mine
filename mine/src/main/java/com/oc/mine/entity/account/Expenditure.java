package com.oc.mine.entity.account;

import java.time.LocalDateTime;

public class Expenditure {
	
	private Integer id;
	private String expenditure_name;
	private Integer expenditure_type;
	private Integer expenditure_amount;
	private LocalDateTime expenditure_time;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getExpenditure_name() {
		return expenditure_name;
	}
	public void setExpenditure_name(String expenditure_name) {
		this.expenditure_name = expenditure_name;
	}
	public Integer getExpenditure_type() {
		return expenditure_type;
	}
	public void setExpenditure_type(Integer expenditure_type) {
		this.expenditure_type = expenditure_type;
	}
	public Integer getExpenditure_amount() {
		return expenditure_amount;
	}
	public void setExpenditure_amount(Integer expenditure_amount) {
		this.expenditure_amount = expenditure_amount;
	}
	public LocalDateTime getExpenditure_time() {
		return expenditure_time;
	}
	public void setExpenditure_time(LocalDateTime expenditure_time) {
		this.expenditure_time = expenditure_time;
	}
	

}
