package com.lianxi.service.help;

import java.util.List;
import java.util.Map;

public interface AssistService {
    //第一步
    List<Map> one(Integer cellphoneId);
    //第二部
    List<Map> two(Integer cellphoneId);
    //第三步
    List<Map> three(Integer cellphoneId);
    //预添加订单
    String saveAssess(String id,Integer cId);
}
