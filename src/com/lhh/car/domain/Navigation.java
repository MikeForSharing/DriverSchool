package com.lhh.car.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 导航栏
 * 
 * @author mike
 * 
 */
public class Navigation {
	private Long id;
	private String name;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
