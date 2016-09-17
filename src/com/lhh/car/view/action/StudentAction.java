package com.lhh.car.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhh.car.domain.Student;
import com.lhh.car.service.StudentService;
import com.lhh.car.util.StudentUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class StudentAction extends BaseAction<Student>{

	private Long parentId;
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	
	public String list() {
		List<Student> studentList = null;
		
		if(parentId == null) {   //顶级部门列表
			studentList = studentService.findTopList();
		}else {  //子部门列表
			studentList = studentService.findChildList(parentId);
			Student parent = studentService.getById(parentId);
			ActionContext.getContext().put("parent", parent);
		}
		
		ActionContext.getContext().put("studentList", studentList);
		return "list";
	}
	
	
	public String add() {
		 //将信息封装到对象
		Student parent = studentService.getById(parentId);
		model.setParent(parent);
		
		//保存
		studentService.save(model);
		return "toList";
		
	}
	
	public String addUI() {
		//获得数据库中部门列表的数据
		List<Student> studentTopList = studentService.findTopList();
		List<Student> studentList = StudentUtil.getAllStudents(studentTopList);
		ActionContext.getContext().put("studentList", studentList);
		return "saveUI";
	}
	
	public String delete() {
		studentService.delete(model.getId());
		return "toList";
	}
	
	public String edit() {
		//从数据库中拿出数据
		Student dept = studentService.getById(model.getId());
		
		//设置要修改的属性
		dept.setDescription(model.getDescription());
		dept.setName(model.getName());
		dept.setParent(studentService.getById(parentId));
		
		studentService.update(dept);
		return "toList";
	}
	
	public String editUI() {
		//获得数据库中部门列表的数据
		List<Student> studentTopList = studentService.findTopList();
		List<Student> studentList = StudentUtil.getAllStudents(studentTopList);
		ActionContext.getContext().put("studentList", studentList);
		//数据回显
		Student dept = studentService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(dept);
		if(dept.getParent() != null) {
			parentId = dept.getParent().getId();
		}

		return "saveUI";
	}




	
}
