package com.lhh.car.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.dao.RoleDao;
import com.lhh.car.domain.Car;
import com.lhh.car.domain.User;
import com.lhh.car.service.CarService;
import com.lhh.car.service.UserService;


@Service
@Transactional
public class UserServiceImpl extends DaoSupportImpl<User> implements UserService {

	public User findByLoginNameAndPassword(String loginName, String password) {
		String md5Digest = DigestUtils.md5Hex(password);
		return (User) getSession().createQuery(//
				"FROM User u WHERE u.loginName=? AND u.password=?")//
				.setParameter(0, loginName)//
				.setParameter(1, md5Digest)//
				.uniqueResult();
	}

}
