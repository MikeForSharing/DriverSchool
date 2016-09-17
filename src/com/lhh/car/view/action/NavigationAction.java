package com.lhh.car.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.lhh.car.domain.Car;
import com.lhh.car.domain.Navigation;
import com.lhh.car.service.CarService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class NavigationAction extends BaseAction<Navigation> {

//	private Navigation navigation;
//	public Navigation getNavigation() {
//		return navigation;
//	}
//
//
//	public void setNavigation(Navigation navigation) {
//		this.navigation = navigation;
//	}


	/**
	 * 驾校简介
	 * @return
	 */
	public String introductionContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "introductionContext";
	}
	
	/**
	 * 收费标准
	 * @return
	 */
	public String chargeStandardContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "chargeStandardContext";
	}
	
	/**
	 * 报名须知
	 * @return
	 */
	public String registrationNoticeContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "registrationNoticeContext";
	}
	
	/**
	 * 证件要求
	 * @return
	 */
	public String certificateRequestContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "certificateRequestContext";
	}
	
	/**
	 * 训练特色
	 * @return
	 */
	public String exerciseCharacterContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "exerciseCharacterContext";
	}
	
	/**
	 * 学习路线
	 * @return
	 */
	public String schoolRouteContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "schoolRouteContext";
	}
	
	/**
	 * 学车攻略
	 * @return
	 */
	public String learnExperienceContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "learnExperienceContext";
	}
	
	/**
	 * 驾校优势
	 * @return
	 */
	public String schoolAdvantageContext() throws Exception {	
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);
		return "schoolAdvantageContext";
	}
	

	/**
	 * 列表
	 * @return
	 */
	public String list() throws Exception {	
		List<Navigation> navigationList = navigationService.findAll();
		ActionContext.getContext().put("navigationList", navigationList);    //把值放在值栈中
		return "list";
	}
	
	
	/**
	 * 删除页面
	 * @return
	 */
	public String delete() throws Exception {
		//System.out.println(model.getId().getClass());

		navigationService.delete(model.getId());
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
		navigationService.save(model);
		return "toList";
	}
	
	/**
	 * 修改页面
	 * @return
	 */ 
	public String editUI() throws Exception{
		//数据回显
		Navigation navigation = navigationService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(navigation);

		return "saveUI";
	}
	
	/**
	 * 修改
	 */
	public String edit() throws Exception {
		//从数据库中拿出数据
		Navigation navigation = navigationService.getById(model.getId());
		//更改数据库对象
		navigation.setDescription(model.getDescription());
		navigation.setName(model.getName());
		//更新到数据库
		navigationService.update(navigation);
		
		return "toList";		
	}



	


}
