package com.lhh.car.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupport;
import com.lhh.car.domain.Car;
import com.lhh.car.domain.User;


public interface UserService extends DaoSupport<User>{

	//根据登录名与密码进行用户查询，注意是明文密码
	User findByLoginNameAndPassword(String loginName, String password);


}
