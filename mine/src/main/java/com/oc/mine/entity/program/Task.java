package com.oc.mine.entity.program;

import java.time.LocalDateTime;

public class Task {

	private Integer id;
	private String task_name;
	private String task_info;
	private Integer time_type;//记录类型
	private Integer complete_count;//完成次数
	private Integer forget_count;//失约次数
	private LocalDateTime record_time;//上次记录时间
	private Integer task_state;//任务启动标志 1启动 2关闭

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public String getTask_info() {
		return task_info;
	}

	public void setTask_info(String task_info) {
		this.task_info = task_info;
	}

	public Integer getTime_type() {
		return time_type;
	}

	public void setTime_type(Integer time_type) {
		this.time_type = time_type;
	}

	public Integer getComplete_count() {
		return complete_count;
	}

	public void setComplete_count(Integer complete_count) {
		this.complete_count = complete_count;
	}

	public Integer getForget_count() {
		return forget_count;
	}

	public void setForget_count(Integer forget_count) {
		this.forget_count = forget_count;
	}

	public LocalDateTime getRecord_time() {
		return record_time;
	}

	public void setRecord_time(LocalDateTime record_time) {
		this.record_time = record_time;
	}

	public Integer getTask_state() {
		return task_state;
	}

	public void setTask_state(Integer task_state) {
		this.task_state = task_state;
	}
}
