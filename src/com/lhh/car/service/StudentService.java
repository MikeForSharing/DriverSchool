package com.lhh.car.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupport;
import com.lhh.car.domain.Student;
import com.lhh.car.domain.Car;


public interface StudentService extends DaoSupport<Student> {

	//查询顶级部门的列表
	public List<Student> findTopList();

	//查询子部门的列表
	public List<Student> findChildList(Long parentId);

}
