package com.oc.mine.entity.account;

public class Purchase {
	private Integer id;
	private String purchase_name;
	private Integer purchase_amount;
	private Integer purchase_state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPurchase_name() {
		return purchase_name;
	}
	public void setPurchase_name(String purchase_name) {
		this.purchase_name = purchase_name;
	}
	public Integer getPurchase_amount() {
		return purchase_amount;
	}
	public void setPurchase_amount(Integer purchase_amount) {
		this.purchase_amount = purchase_amount;
	}
	public Integer getPurchase_state() {
		return purchase_state;
	}
	public void setPurchase_state(Integer purchase_state) {
		this.purchase_state = purchase_state;
	}
	
	

}
