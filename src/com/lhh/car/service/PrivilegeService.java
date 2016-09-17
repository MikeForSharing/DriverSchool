package com.lhh.car.service;

import java.util.Collection;
import java.util.List;

import com.lhh.car.base.DaoSupport;
import com.lhh.car.domain.Privilege;

public interface PrivilegeService extends DaoSupport<Privilege>{

	List<Privilege> findTopList();

	Collection<String> getAllPrivilegeUrls();

}
