package com.lianxi.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface CellphoneModelDao {
    List<CellphoneModelDao> findAll();
}
