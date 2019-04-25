package com.lianxi.service;

import com.lianxi.dao.CellphoneModelDao;

import java.util.List;
public interface CellphoneModelService {
    List<CellphoneModelDao> findAll();
}
