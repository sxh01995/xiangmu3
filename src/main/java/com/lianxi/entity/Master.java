package com.lianxi.entity;

import lombok.Data;

@Data
public class Master {
  private Integer masterId;
  private String masterNumber;
  private String masterPassword;
  private String masterUsername;
  private String masterSalt;
}
