package com.edu.aggregators;

import com.edu.data.IAccount;

import java.util.List;

public class IAccountAggregator {

    public IAccount aggregate(List<IAccount> accounts) {
        return accounts.get(0);
    }

}
