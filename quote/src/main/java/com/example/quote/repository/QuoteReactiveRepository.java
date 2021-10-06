package com.example.quote.repository;


import com.example.quote.model.quotation.Quote;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface QuoteReactiveRepository {

    Mono<Quote> getQuoteById(UUID uuid);
}
