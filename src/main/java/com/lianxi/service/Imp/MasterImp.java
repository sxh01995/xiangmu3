package com.lianxi.service.Imp;

import com.lianxi.dao.MasterDao;
import com.lianxi.entity.Master;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MasterImp implements MasterDao {
    @Resource
    private MasterDao masterDao;

    @Override
    public Master findByNumber(String number) {
        return masterDao.findByNumber(number);
    }
}
