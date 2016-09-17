package com.lhh.car.base;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lhh.car.dao.RoleDao;
import com.lhh.car.dao.UserDao;
import com.lhh.car.dao.impl.RoleDaoImpl;
import com.lhh.car.dao.impl.UserDaoImpl;

public class BaseDaoTest {

	@Test
	public void testSave() {
		UserDao ua = new UserDaoImpl();
		RoleDao ra =new RoleDaoImpl();
		
	}

}
