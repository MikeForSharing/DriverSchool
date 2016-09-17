package com.lhh.car.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhh.car.domain.Coach;
import com.lhh.car.service.CoachService;
import com.lhh.car.util.CoachUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class CoachAction extends BaseAction<Coach>{

	private Long parentId;
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	
	public String list() {
		List<Coach> coachList = null;
		
		if(parentId == null) {   //顶级部门列表
			coachList = coachService.findTopList();
		}else {  //子部门列表
			coachList = coachService.findChildList(parentId);
			Coach parent = coachService.getById(parentId);
			ActionContext.getContext().put("parent", parent);
		}
		
		ActionContext.getContext().put("coachList", coachList);
		return "list";
	}
	
	
	public String add() {
		 //将信息封装到对象
		Coach parent = coachService.getById(parentId);
		model.setParent(parent);
		
		//保存
		coachService.save(model);
		return "toList";
		
	}
	
	public String addUI() {
		//获得数据库中部门列表的数据
		List<Coach> coachTopList = coachService.findTopList();
		List<Coach> coachList = CoachUtil.getAllCoachs(coachTopList);
		ActionContext.getContext().put("coachList", coachList);
		return "saveUI";
	}
	
	public String delete() {
		coachService.delete(model.getId());
		return "toList";
	}
	
	public String edit() {
		//从数据库中拿出数据
		Coach dept = coachService.getById(model.getId());
		
		//设置要修改的属性
		dept.setDescription(model.getDescription());
		dept.setName(model.getName());
		dept.setParent(coachService.getById(parentId));
		
		coachService.update(dept);
		return "toList";
	}
	
	public String editUI() {
		//获得数据库中部门列表的数据
		List<Coach> coachTopList = coachService.findTopList();
		List<Coach> coachList = CoachUtil.getAllCoachs(coachTopList);
		ActionContext.getContext().put("coachList", coachList);
		//数据回显
		Coach dept = coachService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(dept);
		if(dept.getParent() != null) {
			parentId = dept.getParent().getId();
		}

		return "saveUI";
	}




	
}
