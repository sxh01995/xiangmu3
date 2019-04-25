package com.lianxi.service;

import com.lianxi.entity.Assess;

public interface AssessService {
    Integer save(Assess assess);
    Assess findId(String id);
}
