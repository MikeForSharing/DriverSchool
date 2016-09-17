package com.lhh.car.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.domain.Reserve;
import com.lhh.car.service.ReserveService;

@Service
@Transactional
public class ReserveServiceImpl extends DaoSupportImpl<Reserve> implements ReserveService {

}
