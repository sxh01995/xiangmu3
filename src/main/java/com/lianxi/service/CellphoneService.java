package com.lianxi.service;

import com.lianxi.entity.Cellphone;

import java.util.List;

public interface CellphoneService {
    List<Cellphone> findAll(Integer id);
    List<Cellphone> findById(String modelId,Integer id);
    List<Cellphone> findDim(String name,Integer id);
    Cellphone findId(Integer id);
}
