package com.lianxi.dao;

import com.lianxi.entity.Assess;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@MapperScan
public interface AssessDao {
    Integer save(Assess assess);
    Assess findId( String id);
}
