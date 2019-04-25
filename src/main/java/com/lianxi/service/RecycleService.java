package com.lianxi.service;

import com.lianxi.entity.Recycle;

import java.util.List;
public interface RecycleService {
    //根据手机ID查询所有折损主条件
    List<Recycle> findAll(Integer cellphoneId);
}
