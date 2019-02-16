package com.oc.mine.entity.program;

import java.time.LocalDate;

public class Plan {

	private Integer id;
	private String plan_name;
	private String plan_info;
	private LocalDate plan_date;
	private Integer plan_state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public String getPlan_info() {
		return plan_info;
	}

	public void setPlan_info(String plan_info) {
		this.plan_info = plan_info;
	}

	public LocalDate getPlan_date() {
		return plan_date;
	}

	public void setPlan_date(LocalDate plan_date) {
		this.plan_date = plan_date;
	}
	public Integer getPlan_state() {
		return plan_state;
	}

	public void setPlan_state(Integer plan_state) {
		this.plan_state = plan_state;
	}

}
