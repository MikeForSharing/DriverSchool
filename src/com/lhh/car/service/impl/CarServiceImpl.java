package com.lhh.car.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.dao.RoleDao;
import com.lhh.car.domain.Car;
import com.lhh.car.service.CarService;


@Service
@Transactional
public class CarServiceImpl extends DaoSupportImpl<Car> implements CarService {

	
}
