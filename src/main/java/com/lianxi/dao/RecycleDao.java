package com.lianxi.dao;

import com.lianxi.entity.Recycle;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface RecycleDao {
    //查询所有的折损主条件
    List<Recycle> findAll(Integer cellphoneId);
}
