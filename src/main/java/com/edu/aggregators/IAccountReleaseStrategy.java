package com.edu.aggregators;

import org.springframework.integration.aggregator.ReleaseStrategy;
import org.springframework.integration.store.MessageGroup;

public class IAccountReleaseStrategy implements ReleaseStrategy {


    @Override
    public boolean canRelease(MessageGroup group) {
        return group.isComplete();
    }
}
