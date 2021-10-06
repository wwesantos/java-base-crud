package com.example.quote.config.postgres;

import com.example.quote.repository.QuoteBlockingRepository;
import com.example.quote.repository.QuoteReactiveRepository;
import com.example.quote.repository.impl.QuoteReactiveWrapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.scheduler.Scheduler;

@Configuration
public class PostgresReactiveRepositories {

    @Bean
    public QuoteReactiveRepository quoteRepository(QuoteBlockingRepository quoteBlockingRepository, Scheduler pgScheduler) {
        return new QuoteReactiveWrapper(quoteBlockingRepository, pgScheduler);
    }
}
