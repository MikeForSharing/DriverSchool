package com.lhh.car.view.action;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.lhh.car.service.CoachService;
import com.lhh.car.service.CarService;
import com.lhh.car.service.ExamService;
import com.lhh.car.service.FinanceService;
import com.lhh.car.service.NavigationService;
import com.lhh.car.service.PrivilegeService;
import com.lhh.car.service.ReserveService;
import com.lhh.car.service.ReserveTrainService;
import com.lhh.car.service.RoleService;
import com.lhh.car.service.StudentService;
import com.lhh.car.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


//是的action类可以专注于处理请求
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
	
	
	//对ModelDriven的封装
	protected T model; 
	public BaseAction() {
		try {
			//通过反射获取model的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>)pt.getActualTypeArguments()[0];
			//通过反射创建model的实例
			model = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	

	public T getModel() {
		return model;
	}
	
	
	//对service的封装
	@Resource
	protected CoachService coachService;
	
	@Resource
	protected CarService carService;
	
	@Resource
	protected UserService userService;
	
	@Resource
	protected ReserveService reserveService;
	
	@Resource
	protected RoleService roleService;
	
	@Resource
	protected PrivilegeService privilegeService;
	
	@Resource
	protected ExamService examService;
	
	@Resource
	protected FinanceService financeService;
	
	@Resource
	protected StudentService studentService;
	
	@Resource
	protected ReserveTrainService reserveTrainService;
	
	@Resource
	protected NavigationService navigationService;
	
//	@Resource
//	protected AheadService aheadService;
	
}
