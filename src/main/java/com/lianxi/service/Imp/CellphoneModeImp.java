package com.lianxi.service.Imp;

import com.lianxi.dao.CellphoneModelDao;
import com.lianxi.service.CellphoneModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CellphoneModeImp implements CellphoneModelService{
    @Resource
    private CellphoneModelDao cellphoneModelDao;
    @Override
    public List<CellphoneModelDao> findAll() {
        return cellphoneModelDao.findAll();
    }
}
