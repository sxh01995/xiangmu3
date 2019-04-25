package com.lianxi.entity;

import lombok.Data;

@Data
public class Condition {
  private long conditionId;
  private long cellphoneId;
  private String branchId;
  private double conditionMoney;
}
