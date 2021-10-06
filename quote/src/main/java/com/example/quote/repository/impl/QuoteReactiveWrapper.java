package com.example.quote.repository.impl;

import com.example.quote.model.quotation.Quote;
import com.example.quote.repository.QuoteBlockingRepository;
import com.example.quote.repository.QuoteReactiveRepository;
import com.example.quote.repository.ReactiveWrapper;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

import java.util.UUID;

public class QuoteReactiveWrapper implements QuoteReactiveRepository, ReactiveWrapper {

    private final QuoteBlockingRepository quoteRepository;
    private final Scheduler scheduler;

    public QuoteReactiveWrapper(QuoteBlockingRepository quoteRepository,
                                Scheduler scheduler) {
        this.quoteRepository = quoteRepository;
        this.scheduler = scheduler;
    }

    @Override
    public Mono<Quote> getQuoteById(UUID uuid) {
        return wrapTypeMethod(() -> quoteRepository.findById(uuid), scheduler);
    }

}
