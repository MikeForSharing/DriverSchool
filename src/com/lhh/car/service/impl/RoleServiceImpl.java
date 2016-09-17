package com.lhh.car.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.dao.RoleDao;
import com.lhh.car.domain.Role;
import com.lhh.car.service.RoleService;


@Service
@Transactional
public class RoleServiceImpl extends DaoSupportImpl<Role> implements RoleService {

}
