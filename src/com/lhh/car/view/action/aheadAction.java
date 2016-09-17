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
public class aheadAction extends BaseAction<User>{
	
	private Long coachId;
	private Long[] carIds;
	
	private Long[] roleIds;
	
	
	
	
	public String index() throws Exception {
		
		
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

		
		return "index";
	}
	
	
	
	public String addSuccess() {
		
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
		return "toIndex";
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
