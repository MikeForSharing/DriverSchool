package com.lhh.car.view.action;

import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.lhh.car.domain.Privilege;
import com.lhh.car.domain.Role;
import com.lhh.car.service.RoleService;

@Controller
@Scope("prototype")
public class RoleAction extends BaseAction<Role> {

	
	private Long[] privilegeIds;
	
	/**
	 * 列表
	 * @return
	 */
	public String list() throws Exception {	
		List<Role> roleList = roleService.findAll();
		ActionContext.getContext().put("roleList", roleList);    //把值放在值栈中
		return "list";
	}
	
	/**
	 * 删除页面
	 * @return
	 */
	public String delete() throws Exception {
		//System.out.println(model.getId().getClass());

		roleService.delete(model.getId());
		return "toList";
	}
	
	/**
	 * 添加页面
	 */
	public String addUI() throws Exception {
		return "saveUI";		
	}
	

	/**
	 * 添加
	 * @return
	 */
	public String add() throws Exception {
//		//封装对象
//		Role role = new Role();
//		role.setName(model.getName());
//		role.setDescription(model.getDescription());

		
		//将对象存储到数据库
		roleService.save(model);
		return "toList";
	}
	
	/**
	 * 修改页面
	 * @return
	 */ 
	public String editUI() throws Exception{
		//数据回显
		Role role = roleService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(role);

		return "saveUI";
	}
	
	/**
	 * 修改
	 */
	public String edit() throws Exception {
		//从数据库中拿出数据
		Role role = roleService.getById(model.getId());
		//更改数据库对象
		role.setDescription(model.getDescription());
		role.setName(model.getName());
		//更新到数据库
		roleService.update(role);
		
		return "toList";		
	}


	
	

	/** 设置权限页面 */
	public String setPrivilegeUI() throws Exception {
		// 准备回显的数据
		Role role = roleService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(role);

		if (role.getPrivileges() != null) {
			privilegeIds = new Long[role.getPrivileges().size()];
			int index = 0;
			for (Privilege priv : role.getPrivileges()) {
				privilegeIds[index++] = priv.getId();
			}
		}

		// 准备数据 privilegeList
		List<Privilege> privilegeList = privilegeService.findAll();
		ActionContext.getContext().put("privilegeList", privilegeList); 

		return "setPrivilegeUI";
	}

	/** 设置权限 */
	public String setPrivilege() throws Exception {
		// 1，从数据库中获取原对象
		Role role = roleService.getById(model.getId());

		// 2，设置要修改的属性
		List<Privilege> privilegeList = privilegeService.getByIds(privilegeIds);
		role.setPrivileges(new HashSet<Privilege>(privilegeList));

		// 3，更新到数据库
		roleService.update(role);

		return "toList";
	}

	public Long[] getPrivilegeIds() {
		return privilegeIds;
	}

	public void setPrivilegeIds(Long[] privilegeIds) {
		this.privilegeIds = privilegeIds;
	}


}
