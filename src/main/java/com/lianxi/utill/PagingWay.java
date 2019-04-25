package com.lianxi.utill;

import static com.lianxi.utill.Paging.CE_MAX;

public class PagingWay {
    public static Integer min(Integer id){
        return (id-1)*CE_MAX;
    }
}
