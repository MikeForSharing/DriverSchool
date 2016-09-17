package com.lhh.car.view.action;

import java.util.HashSet;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhh.car.domain.Coach;
import com.lhh.car.domain.Car;
import com.lhh.car.domain.Role;
import com.lhh.car.domain.User;
import com.lhh.car.util.CoachUtil;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	
	private Long coachId;
	private Long[] carIds;
	
	private Long[] roleIds;
	
	
	
	
	User user = (User) ActionContext.getContext().getSession().get("user"); // 当前登录用户
	
	public String list() throws Exception {
		if(user.getId() == 1) {
			List<User> userList = userService.findAll();
			ActionContext.getContext().put("userList", userList);
		} else {
			List<User> userListSingle = userService.findAll(user.getId());
			ActionContext.getContext().put("userList", userListSingle);
		}
		return "list";

		
	}
	
	public String delete() throws Exception {
		userService.delete(model.getId());
		return "toList";
	}
	
	public String addUI() throws Exception {
		//将coach列表信息列出
		List<Coach> coachTopList = coachService.findTopList();
		List<Coach> coachList = CoachUtil.getAllCoachs(coachTopList);
		ActionContext.getContext().put("coachList", coachList);
		
		//将car列表信息列出
		List<Car> carList = carService.findAll();
		ActionContext.getContext().put("carList", carList);    //把值放在值栈中
		
		//将role类别信息列出
		List<Role> roleList = roleService.findAll();
		ActionContext.getContext().put("roleList", roleList);
		return "saveUI";
	}
	
	public String add() throws Exception {
		//将数据封装到对象中（当model是实体类型时，将未封装的属性设置到model后，可以使用model）
		model.setCoach(coachService.getById(coachId));
		List<Car> carList = carService.getByIds(carIds);
		model.setCars(new HashSet<Car>(carList));
		
		List<Role> roleList = roleService.getByIds(roleIds);
		model.setRoles(new HashSet<Role>(roleList));
		
		//设置默认的密码（要使用MD5摘要）
		String md5Digest = DigestUtils.md5Hex("hadoop");		
		model.setPassword(md5Digest);

		//将对象保存到数据库中
		userService.save(model);
		
		return "toList";
	}
	
	public String editUI() throws Exception {
		//将coach列表信息列出
		List<Coach> coachTopList = coachService.findTopList();
		List<Coach> coachList = CoachUtil.getAllCoachs(coachTopList);
		ActionContext.getContext().put("coachList", coachList);
		
		//将car列表信息列出
		List<Car> carList = carService.findAll();
		ActionContext.getContext().put("carList", carList);    //把值放在值栈中
		
		//将role列表信息列出
		List<Role> roleList = roleService.findAll();
		ActionContext.getContext().put("roleList", roleList);
		
		//数据回显
		User user = userService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(user);
		if(user.getCoach() != null) {
			coachId = user.getCoach().getId();
		}
		
		if(user.getCars() != null) {
			carIds = new Long[user.getCars().size()];
			int index = 0;
			for(Car car : user.getCars()) {
				carIds[index++] = car.getId(); 
			}
		}
		
		if(user.getRoles() != null) {
			roleIds = new Long[user.getRoles().size()];
			int index = 0;
			for(Role role : user.getRoles()) {
				roleIds[index++] = role.getId();
			}
		}
		
		return "saveUI";
	}

	public String edit() throws Exception {
		//1:将对象从数据库中拿出
		User user = userService.getById(model.getId());
		//2:设置对象的属性
		user.setCoach(coachService.getById(coachId));
		List<Car> carList = carService.getByIds(carIds);
		user.setCars(new HashSet<Car>(carList));
		
		List<Role> roleList = roleService.getByIds(roleIds);
		user.setRoles(new HashSet<Role>(roleList));
		
		user.setLoginName(model.getLoginName());
		user.setName(model.getName());
		user.setGender(model.getGender());
		user.setPhoneNumber(model.getPhoneNumber());
		user.setDescription(model.getDescription());
		
		//3:将对象保存到数据库
		userService.update(user);
		
		return "toList";
	}
	
	public String initPassword() {
		//1:将数据库中对象拿出来
		User user = userService.getById(model.getId());
		//2:设置修改的属性(使用md5加密)
		String md5Digest = DigestUtils.md5Hex("hadoop");
		user.setPassword(md5Digest);
		//3:将对象保存到数据库中
		userService.update(user);
		
		return "toList";
	}
	
	
	
	public String loginUI() throws Exception {
		return "loginUI";
	}
	
	
	public String login() throws Exception {
		User user = userService.findByLoginNameAndPassword(model.getLoginName(), model.getPassword());
		if(user == null) {
			addFieldError("login", "用户名或密码不正确！");
			return "loginUI";
		}else {
			ActionContext.getContext().getSession().put("user", user);
			return "toIndex";
		}
	} 
	
	public String logout() throws Exception {
//		ActionContext.getContext().getSession().remove("user");
		return "logout";
	}
	
	

	public Long[] getCarIds() {
		return carIds;
	}

	public void setCarIds(Long[] carIds) {
		this.carIds = carIds;
	}

	public Long getCoachId() {
		return coachId;
	}

	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}

	public Long[] getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Long[] roleIds) {
		this.roleIds = roleIds;
	}

	
 }
