package com.lhh.car.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupport;
import com.lhh.car.domain.Coach;
import com.lhh.car.domain.Car;


public interface CoachService extends DaoSupport<Coach> {

	//查询顶级部门的列表
	public List<Coach> findTopList();

	//查询子部门的列表
	public List<Coach> findChildList(Long parentId);

}
