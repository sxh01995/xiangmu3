package com.lianxi.service;

import com.lianxi.entity.Helper;

import java.util.List;

public interface RecycleBranchService {
    List<Helper> findHelp(String sortId);
}
