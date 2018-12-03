package com.edu.channels.executors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.task.TaskExecutor;

@Slf4j
public class AccountsExecutor implements TaskExecutor {

    @Override
    public void execute(Runnable task) {
        log.info("{}", task);
    }
}
