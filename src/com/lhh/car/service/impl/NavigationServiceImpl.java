package com.lhh.car.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.dao.RoleDao;
import com.lhh.car.domain.Car;
import com.lhh.car.domain.Navigation;
import com.lhh.car.service.CarService;
import com.lhh.car.service.NavigationService;


@Service
@Transactional
public class NavigationServiceImpl extends DaoSupportImpl<Navigation> implements NavigationService {

	
}
