package com.lhh.car.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lhh.car.base.DaoSupportImpl;
import com.lhh.car.domain.Exam;
import com.lhh.car.service.ExamService;

@Service
@Transactional
public class ExamServiceImpl extends DaoSupportImpl<Exam> implements ExamService {

}
