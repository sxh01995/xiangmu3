package com.lianxi.service.Imp;

import com.lianxi.dao.ConditionDao;
import com.lianxi.service.ConditionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConditionImp implements ConditionService{
    @Resource
    private ConditionDao conditionDao;
}
