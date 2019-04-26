package com.lianxi.service.Imp;

import com.lianxi.dao.MasterDao;
import com.lianxi.entity.Master;
import com.lianxi.service.MasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MasterImp implements MasterService {
    @Resource
    private MasterDao masterDao;

    @Override
    public Master findByNumber(String number) {
        Master master = masterDao.findByNumber(number);
        if(master!=null){
            return master;
        }
        return null;
    }
}
