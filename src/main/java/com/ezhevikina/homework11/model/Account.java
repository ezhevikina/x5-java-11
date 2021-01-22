package com.ezhevikina.homework11.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Account {
  private int id;
  @Setter
  private String holder;
  @Setter
  private int amount;
}

