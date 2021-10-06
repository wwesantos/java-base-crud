package com.example.quote.service;

import com.example.quote.model.quotation.Quote;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface QuoteService {
    Mono<Quote> getQuote(UUID id);
}
