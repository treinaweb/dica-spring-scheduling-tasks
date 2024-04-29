package br.com.treinaweb.springscheduling.core.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ScheduledTasks {

    private static final int FIXED_DELAY = 5000;
    private static final int INITIAL_DELAY = 2000;
    private static final int FIXED_RATE = 5000;
    private static final String CRON = "0/5 * * * * *";

    private static final int SLEEP = 2000;

    @Scheduled(cron = CRON)
    public void taskExample() throws InterruptedException {
        log.info("Task Terminou");
    }
    
}
