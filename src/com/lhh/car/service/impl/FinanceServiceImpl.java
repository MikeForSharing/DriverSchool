package com.lhh.car.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.dao.RoleDao;
import com.lhh.car.domain.Finance;
import com.lhh.car.service.CarService;
import com.lhh.car.service.FinanceService;


@Service
@Transactional
public class FinanceServiceImpl extends DaoSupportImpl<Finance> implements FinanceService {

}
