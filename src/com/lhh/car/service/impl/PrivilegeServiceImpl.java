package com.lhh.car.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.domain.Privilege;
import com.lhh.car.service.PrivilegeService;

@Service
@Transactional   //其实没用，但是为了表示这里有事务，所以就写了这个注解
public class PrivilegeServiceImpl extends DaoSupportImpl<Privilege> implements PrivilegeService  {

	public List<Privilege> findTopList() {
		return getSession().createQuery(//
				"FROM Privilege p WHERE p.parent IS NULL")//
				.list();
	}

	public Collection<String> getAllPrivilegeUrls() {
		return getSession().createQuery(//
				"SELECT DISTINCT p.url FROM Privilege p WHERE p.url IS NOT NULL")//
				.list();
	}

}
