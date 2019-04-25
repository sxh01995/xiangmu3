package com.lianxi.dao;

import com.lianxi.entity.Cellphone;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface CellphoneDao {
//    分页查询
    List<Cellphone> findAll(@Param("id")Integer id,@Param("page")Integer page);
//    根据ID查询
    List<Cellphone> findById(@Param("modelId")String modelId,@Param("id")Integer id,@Param("page")Integer page);
//    模糊查询
    List<Cellphone> findDim(@Param("name") String name,@Param("id")Integer id,@Param("page")Integer page);
    //根据ID查手机信息
    Cellphone findId(Integer id);
}
