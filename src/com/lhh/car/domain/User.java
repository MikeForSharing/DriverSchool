package com.lhh.car.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.lhh.car.domain.Role;
import com.opensymphony.xwork2.ActionContext;

/**
 * 用户
 * @author mike
 * 
 */
public class User {
	private Long id;
	private Coach coach;
	private Set<Car> cars = new HashSet<Car>();
	private Set<Role> roles = new HashSet<Role>();
	
	private Set<Finance> finances = new HashSet<Finance>();
	

	private String loginName; // 登录名
	private String password; // 密码
	private String name; // 真实姓名
	private String gender; // 性别
	private String phoneNumber; // 电话号码
	private String email; // 电子邮件
	private String description; // 说明

	
	
	//识别本用户是否含有指定名称的权限
	public boolean hasPrivilegeByName(String name) {
		//针对超级管理员，可以拥有所有权限
		if(isAdmin()) {
			return true;
		}
		
		//针对普通用户，判断是否含有这个权限
		for(Role role : roles) {
			for(Privilege priv : role.getPrivileges()) {
				if(priv.getName().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	//识别本用户是否含有指定URL的权限
		public boolean hasPrivilegeByUrl(String privUrl) {
			//针对超级管理员，可以拥有所有权限
			if(isAdmin()) {
				return true;
			}
			// >> 去掉后面的参数
			int pos = privUrl.indexOf("?");
			if (pos > -1) {
				privUrl = privUrl.substring(0, pos);
			}
			// >> 去掉UI后缀
			if (privUrl.endsWith("UI")) {
				privUrl = privUrl.substring(0, privUrl.length() - 2);
			}
			
			
			//如果本URL不需要控制，则登录用户就可以使用
			Collection<String> allPrivilegeUrls = (Collection<String>) ActionContext.getContext().getApplication().get("allPrivilegeUrls");
			if (!allPrivilegeUrls.contains(privUrl)) {
				return true;
			} else {
				// 普通用户要判断是否含有这个权限
				for (Role role : roles) {
					for (Privilege priv : role.getPrivileges()) {
						if (privUrl.equals(priv.getUrl())) {
							return true;
						}
					}
				}
				return false;
			}
		}
	
	
	//识别是否是超级管理员
	public boolean isAdmin() {
		return "admin".equals(loginName);
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public Set<Finance> getFinances() {
		return finances;
	}


	public void setFinances(Set<Finance> finances) {
		this.finances = finances;
	}



	

}
