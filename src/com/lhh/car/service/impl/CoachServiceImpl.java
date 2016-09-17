package com.lhh.car.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.dao.DepartmentDao;
import com.lhh.car.domain.Coach;
import com.lhh.car.domain.Car;
import com.lhh.car.service.CoachService;


@Service
@Transactional
public class CoachServiceImpl extends DaoSupportImpl<Coach> implements CoachService {

	@Resource
	private SessionFactory sessionFactory;
	
	public List<Coach> findTopList() {
		return sessionFactory.getCurrentSession().createQuery(//
				"FROM Coach d WHERE d.parent IS NULL")//
				.list();
		
	}

	public List<Coach> findChildList(Long parentId) {
		return sessionFactory.getCurrentSession().createQuery(//
				"FROM Coach d WHERE d.parent.id = ?")//
				.setParameter(0, parentId)//
				.list();
	}

	



}
