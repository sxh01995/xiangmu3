package com.lianxi.dao;

import com.lianxi.entity.Helper;
import com.lianxi.entity.RecycleBranch;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface RecycleBranchDao {
    //查询每个折损主条件的子条件
    List<RecycleBranch> findById(@Param("cellphoneId") Integer cellphoneId, @Param("recycleId") String recycleId);
    //查询出所有的折损子条件ID
    List<Helper>findHelp(String[] ids);
}
