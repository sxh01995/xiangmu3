package com.lianxi.service.Imp;

import com.lianxi.dao.AssessDao;
import com.lianxi.entity.Assess;
import com.lianxi.service.AssessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AssessImp implements AssessService {
    @Resource
    private AssessDao assessDao;

    @Override
    public Integer save(Assess assess) {
        return assessDao.save(assess);
    }

    @Override
    public Assess findId(String id) {
        Assess assess = assessDao.findId(id);
        System.out.println(assess);
        return assess;
    }
}
