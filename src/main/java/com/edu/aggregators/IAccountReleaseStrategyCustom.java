package com.edu.aggregators;

import org.springframework.integration.store.MessageGroup;

public class IAccountReleaseStrategyCustom {

    public boolean canReleaseGroup(MessageGroup group) {
        return group.isComplete();
    }
}
