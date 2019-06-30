package com.edu.sandbox.weather.release;

import org.springframework.integration.aggregator.ReleaseStrategy;
import org.springframework.integration.store.MessageGroup;

public class AmountReleaseStrategy implements ReleaseStrategy {

    private int topbound;

    @Override
    public boolean canRelease(MessageGroup group) {
        return group.size() >= topbound;
    }

    public void setTopbound(int topbound) {
        this.topbound = topbound;
    }
}
