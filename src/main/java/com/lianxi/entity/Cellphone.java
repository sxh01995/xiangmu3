package com.lianxi.entity;

import lombok.Data;

@Data
public class Cellphone {
  private Integer cellphoneId;
  private Integer modelId;
  private String cellphoneName;
  private String cellphoneImg;
  private Integer cellphonePrice;
}
