package com.edu.channels.executors;

import lombok.extern.log4j.Log4j2;
import org.springframework.core.task.TaskExecutor;

@Log4j2
public class AccountsExecutorSX implements TaskExecutor {

    @Override
    public void execute(Runnable task) {
        log.debug("{}", task);
    }
}
