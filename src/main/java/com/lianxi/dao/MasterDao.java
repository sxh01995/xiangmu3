package com.lianxi.dao;

import com.lianxi.entity.Master;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@MapperScan
public interface MasterDao {
    Master findByNumber(String number);
}
