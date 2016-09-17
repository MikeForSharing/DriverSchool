package com.lhh.car.util;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.domain.Privilege;
import com.lhh.car.domain.User;




//根据相应的数据库生成正确的代码，再结合hibernate，就可以支持多种数据库
@Component
public class Installer {

	@Resource
	private SessionFactory sessionFactory;

	/**
	 * 执行安装
	 */
	@Transactional
	public void install() {
		Session session = sessionFactory.getCurrentSession();

		// ==============================================================
		// 保存超级管理员用户
		User user = new User();
		user.setLoginName("admin");
		user.setName("超级管理员");
		user.setPassword(DigestUtils.md5Hex("hadoop"));
		session.save(user); // 保存

		
		
		// ==============================================================
		// 保存权限数据
		Privilege menu, menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8, menu9, menu10;

		// --------------------
		menu = new Privilege("系统管理", null, null);
		session.save(menu);
		
		
		menu1 = new Privilege("岗位管理", "/role_list", menu);
		menu2 = new Privilege("教练管理", "/coach_list", menu);
		menu3 = new Privilege("用户管理", "/user_list", menu);
		menu4 = new Privilege("车辆管理", "/car_list", menu);
		menu5 = new Privilege("财务管理", "/finance_list", menu);
		menu6 = new Privilege("考试管理", "/exam_list", menu);
		menu7 = new Privilege("考试预约管理", "/reserve_list", menu);
		menu8 = new Privilege("学员管理", "/student_list", menu);
		menu9 = new Privilege("培训预约管理", "/reserveTrain_list", menu);
		menu10 = new Privilege("导航栏管理", "/navigation_list",menu);

		
		
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		session.save(menu4);
		session.save(menu5);
		session.save(menu6);
		session.save(menu7);
		session.save(menu8);
		session.save(menu9);
		session.save(menu10);
		
		

		session.save(new Privilege("岗位列表", "/role_list", menu1));
		session.save(new Privilege("岗位删除", "/role_delete", menu1));
		session.save(new Privilege("岗位添加", "/role_add", menu1));   //不写addUI
		session.save(new Privilege("岗位修改", "/role_edit", menu1));
		session.save(new Privilege("设置权限", "/role_setPrivilege", menu1));

		session.save(new Privilege("教练列表", "/coach_list", menu2));
		session.save(new Privilege("教练删除", "/coach_delete", menu2));
		session.save(new Privilege("教练添加", "/coach_add", menu2));
		session.save(new Privilege("教练修改", "/coach_edit", menu2));

		session.save(new Privilege("用户列表", "/user_list", menu3));
		session.save(new Privilege("用户删除", "/user_delete", menu3));
		session.save(new Privilege("用户添加", "/user_add", menu3));
		session.save(new Privilege("用户修改", "/user_edit", menu3));
		session.save(new Privilege("初始化密码", "/user_initPassword", menu3));
		
		session.save(new Privilege("车辆列表", "/car_list", menu4));
		session.save(new Privilege("车辆删除", "/car_delete", menu4));
		session.save(new Privilege("车辆添加", "/car_add", menu4));
		session.save(new Privilege("车辆修改", "/car_edit", menu4));
		
		session.save(new Privilege("财务列表", "/finance_list", menu5));
		session.save(new Privilege("财务删除", "/finance_delete", menu5));
		session.save(new Privilege("财务添加", "/finance_add", menu5));
		session.save(new Privilege("财务修改", "/finance_edit", menu5));
		
		session.save(new Privilege("考试列表", "/exam_list", menu6));
		session.save(new Privilege("考试删除", "/exam_delete", menu6));
		session.save(new Privilege("考试添加", "/exam_add", menu6));
		session.save(new Privilege("考试修改", "/exam_edit", menu6));
		
		session.save(new Privilege("考试预约列表", "/reserve_list", menu7));
		session.save(new Privilege("考试预约删除", "/reserve_delete", menu7));
		session.save(new Privilege("考试预约添加", "/reserve_add", menu7));
		session.save(new Privilege("考试预约修改", "/reserve_edit", menu7));

		
		
		
		session.save(new Privilege("学员列表", "/student_list", menu8));
		session.save(new Privilege("学员删除", "/student_delete", menu8));
		session.save(new Privilege("学员添加", "/student_add", menu8));
		session.save(new Privilege("学员修改", "/student_edit", menu8));
		
		
		session.save(new Privilege("培训预约列表", "/reserve_list", menu9));
		session.save(new Privilege("培训预约删除", "/reserve_delete", menu9));
		session.save(new Privilege("培训预约添加", "/reserve_add", menu9));
		session.save(new Privilege("培训预约修改", "/reserve_edit", menu9));
		
		session.save(new Privilege("导航栏列表", "/navigation_list", menu10));
		session.save(new Privilege("导航栏删除", "/navigation_delete", menu10));
		session.save(new Privilege("导航栏添加", "/navigation_add", menu10));
		session.save(new Privilege("导航栏修改", "/navigation_edit", menu10));
		
	}

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Installer installer = (Installer) ac.getBean("installer");
		installer.install();
	}
}
