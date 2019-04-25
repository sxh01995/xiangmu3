package com.lianxi.service.Imp;

import com.lianxi.dao.RecycleDao;
import com.lianxi.entity.Recycle;
import com.lianxi.service.RecycleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RecycleImp implements RecycleService {
    @Resource
    private RecycleDao recycleDao;
    @Override
    public List<Recycle> findAll(Integer cellphoneId) {
        return recycleDao.findAll(cellphoneId);
    }
}
