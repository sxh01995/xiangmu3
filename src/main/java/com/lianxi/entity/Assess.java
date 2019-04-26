package com.lianxi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Assess {
  private String assessId;
  private Integer cellphoneId;
  private Integer assessPrice;
  private String assessCellphone;
  private String cellphoneImg;
}
