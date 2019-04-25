package com.lianxi.service.Imp;

import com.lianxi.dao.RecycleBranchDao;
import com.lianxi.entity.Helper;
import com.lianxi.service.RecycleBranchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecycleBranchImp implements RecycleBranchService {
    @Resource
    private RecycleBranchDao recycleBranchDao;
    @Override
    public List<Helper> findHelp(String sortId) {
        String[] split = sortId.toString().split(",");
        List<Helper> help = recycleBranchDao.findHelp(split);
        return help;
    }
}
