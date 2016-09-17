package com.lhh.car.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.lhh.car.domain.Car;
import com.lhh.car.service.CarService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class CarAction extends BaseAction<Car> {

	/**
	 * 列表
	 * @return
	 */
	public String list() throws Exception {	
		List<Car> carList = carService.findAll();
		ActionContext.getContext().put("carList", carList);    //把值放在值栈中
		return "list";
	}
	
	/**
	 * 删除页面
	 * @return
	 */
	public String delete() throws Exception {
		//System.out.println(model.getId().getClass());

		carService.delete(model.getId());
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
		carService.save(model);
		return "toList";
	}
	
	/**
	 * 修改页面
	 * @return
	 */ 
	public String editUI() throws Exception{
		//数据回显
		Car car = carService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(car);

		return "saveUI";
	}
	
	/**
	 * 修改
	 */
	public String edit() throws Exception {
		//从数据库中拿出数据
		Car car = carService.getById(model.getId());
		//更改数据库对象
		car.setDescription(model.getDescription());
		car.setName(model.getName());
		//更新到数据库
		carService.update(car);
		
		return "toList";		
	}



	


}
