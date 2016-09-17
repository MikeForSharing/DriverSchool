package com.lhh.car.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 教练
 * 
 * @author mike
 * 
 */
public class Coach {
	private Long id;
	private Set<User> users = new HashSet<User>();
	private Coach parent;
	private Set<Coach> children = new HashSet<Coach>();
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Coach getParent() {
		return parent;
	}

	public void setParent(Coach parent) {
		this.parent = parent;
	}

	public Set<Coach> getChildren() {
		return children;
	}

	public void setChildren(Set<Coach> children) {
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
