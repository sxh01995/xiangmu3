package com.lianxi.service.Imp;

import com.lianxi.dao.CellphoneDao;
import com.lianxi.entity.Cellphone;
import com.lianxi.service.CellphoneService;
import com.lianxi.utill.PagingWay;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.lianxi.utill.Paging.CE_MAX;

@Service
public class CellphoneImp implements CellphoneService {
    @Resource
    private CellphoneDao cellphoneDao;
    //分页查询
    @Override
    public List<Cellphone> findAll(Integer id) {
        return cellphoneDao.findAll(PagingWay.min(id),CE_MAX);
    }
    //根据型号查询
    @Override
    public List<Cellphone> findById(String modelId, Integer id) {
        return cellphoneDao.findById(modelId,PagingWay.min(id),CE_MAX);
    }

    //模糊查询
    @Override
    public List<Cellphone> findDim(String name, Integer id) {
        if(name!=null&&!name.trim().equals("")&&!name.equals("0")){
            name=name+"%";
        }else {
            name=null;
        }
        return cellphoneDao.findDim(name,PagingWay.min(id),CE_MAX);
    }

    @Override
    public Cellphone findId(Integer id) {
        return cellphoneDao.findId(id);
    }
}
