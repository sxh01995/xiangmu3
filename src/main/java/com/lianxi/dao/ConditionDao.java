package com.lianxi.dao;

import com.lianxi.entity.Condition;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface ConditionDao {
    List<Condition> findById(String[] ids);
}
