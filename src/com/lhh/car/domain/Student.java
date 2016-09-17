package com.lhh.car.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 学员
 * 
 * @author mike
 * 
 */
public class Student {
	private Long id;
	private Student parent;
	private Set<Student> children = new HashSet<Student>();
	private String name;
	private String description;
	
	
	
	private Set<Reserve> reserves = new HashSet<Reserve>();
	
	
	private Set<ReserveTrain> reserveTrains = new HashSet<ReserveTrain>();
	
	
	public Set<ReserveTrain> getReserveTrains() {
		return reserveTrains;
	}
	public void setReserveTrains(Set<ReserveTrain> reserveTrains) {
		this.reserveTrains = reserveTrains;
	}
	public Set<Reserve> getReserves() {
		return reserves;
	}
	public void setReserves(Set<Reserve> reserves) {
		this.reserves = reserves;
	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getParent() {
		return parent;
	}

	public void setParent(Student parent) {
		this.parent = parent;
	}

	public Set<Student> getChildren() {
		return children;
	}

	public void setChildren(Set<Student> children) {
		this.children = children;
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
