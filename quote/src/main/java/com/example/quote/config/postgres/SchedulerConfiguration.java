package com.example.quote.config.postgres;


import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@Configuration
public class SchedulerConfiguration {
    private String threadPrefix = "pg-scheduler";

    @Bean(destroyMethod = "dispose")
    public Scheduler pgScheduler(BeanFactory beanFactory) {
        return Schedulers.boundedElastic();
    }
}
