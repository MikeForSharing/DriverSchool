package com.lhh.car.view.action;

import java.util.HashSet;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.domain.Car;
import com.lhh.car.domain.Coach;
import com.lhh.car.domain.Reserve;
import com.lhh.car.domain.Student;
import com.lhh.car.domain.User;
import com.lhh.car.util.CoachUtil;
import com.lhh.car.util.StudentUtil;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class ReserveAction extends BaseAction<Reserve> {
	
	private Long coachId;
	private Long studentId;
	
	
	User user = (User) ActionContext.getContext().getSession().get("user"); // 当前登录用户
	//列表
	public String list() throws Exception{
		if(user.getId() == 1) {
		List<Reserve> reserveList = reserveService.findAll();
		ActionContext.getContext().put("reserveList", reserveList);

		}else if(user.getCoach() == null  ) {
			List<Reserve> reserveListSingle = reserveService.findAllreserve(user.getId());
			ActionContext.getContext().put("reserveList", reserveListSingle);
		}
		return "list";
	}
	
	
	//删除页面
	public String delete() throws Exception {
		reserveService.delete(model.getId());
		return "toList";
	}
	
	
	public String addUI() throws Exception {
		//将coach列表信息列出
		List<Coach> coachTopList = coachService.findTopList();
		List<Coach> coachList = CoachUtil.getAllCoachs(coachTopList);
		ActionContext.getContext().put("coachList", coachList);
		
		//将student列表信息列出
		List<Student> studentTopList = studentService.findTopList();
		List<Student> studentList = StudentUtil.getAllStudents(studentTopList);
		ActionContext.getContext().put("studentList", studentList);
		
		return "saveUI";
	}
	
	
	public String add() throws Exception {
		//将数据封装到对象中（当model是实体类型时，将未封装的属性设置到model后，可以使用model）
		model.setCoach(coachService.getById(coachId));
		model.setStudent(studentService.getById(studentId));

		//将对象保存到数据库中
		reserveService.save(model);
		
		return "toList";
	}
	
	public String editUI() throws Exception {
		//将coach列表信息列出
		List<Coach> coachTopList = coachService.findTopList();
		List<Coach> coachList = CoachUtil.getAllCoachs(coachTopList);
		ActionContext.getContext().put("coachList", coachList);
		
		
		//将student列表信息列出
		List<Student> studentTopList = studentService.findTopList();
		List<Student> studentList = StudentUtil.getAllStudents(studentTopList);
		ActionContext.getContext().put("studentList", studentList);
		
		//数据回显
		Reserve reserve = reserveService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(reserve);
		if(reserve.getCoach() != null) {
			coachId = reserve.getCoach().getId();
		}
		return "saveUI";
	}

	public String edit() throws Exception {
		//1:将对象从数据库中拿出
		Reserve reserve = reserveService.getById(model.getId());
		//2:设置对象的属性
		reserve.setCoach(coachService.getById(coachId));
		reserve.setStudent(studentService.getById(studentId));
		reserve.setDate(model.getDate());
		reserve.setType(model.getType());
		reserve.setDescription(model.getDescription());
		
		
		//3:将对象保存到数据库
		reserveService.update(reserve);
		
		return "toList";
	}


	public Long getCoachId() {
		return coachId;
	}


	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}
	
	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	
	
}
