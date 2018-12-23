package com.edu.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {

    private String name;
    private int age;
    private AccountType accountType;

}
