package com.ezhevikina.homework11.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Transfer {
    private int amount;
    private int receiverAccountId;
}
