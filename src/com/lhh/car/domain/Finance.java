package com.lhh.car.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class Finance {
	private Long id;
	private Timestamp date;
	private String type;	
	private User user;
	
	private Long money;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getMoney() {
		return money;
	}
	public void setMoney(Long money) {
		this.money = money;
	}


	
}
