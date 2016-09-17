package com.lhh.car.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lhh.car.domain.Coach;
import com.lhh.car.domain.Exam;
import com.lhh.car.domain.Reserve;
import com.lhh.car.service.ExamService;
import com.lhh.car.util.CoachUtil;
import com.opensymphony.xwork2.ActionContext;


@Controller
@Scope("prototype")
public class ExamAction extends BaseAction<Exam>{
	
	//列表
	public String list() throws Exception{
		List<Exam> examList = examService.findAll();
		ActionContext.getContext().put("examList", examList);
		return "list";
	}
	
	
	//删除
	public String delete() throws Exception{
		examService.delete(model.getId());
		return "toList";
	}
	
	
	//添加页面
	public String addUI() throws Exception {		
		return "saveUI";
	}
	
	public String add() throws Exception {
		//将对象保存到数据库中
		examService.save(model);
		return "toList";
	}
	
	public String editUI() throws Exception {
		//数据回显
		Exam exam = examService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(exam);
		return "saveUI";
	}

	public String edit() throws Exception {
		//1:将对象从数据库中拿出
		Exam exam = examService.getById(model.getId());
		//2:设置对象的属性		
		exam.setAddr(model.getAddr());
		exam.setDate(model.getDate());
		exam.setType(model.getType());

		//3:将对象保存到数据库
		examService.update(exam);
		
		return "toList";
	}
}
