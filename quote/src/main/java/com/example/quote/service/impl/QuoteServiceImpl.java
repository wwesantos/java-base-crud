package com.example.quote.service.impl;

import com.example.quote.mapper.QuoteMapper;
import com.example.quote.model.quotation.Quote;
import com.example.quote.repository.QuoteReactiveRepository;
import com.example.quote.service.QuoteService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuoteReactiveRepository quoteRepository;
    private final QuoteMapper quoteMapper;

    public QuoteServiceImpl(QuoteReactiveRepository quoteRepository, QuoteMapper quoteMapper) {
        this.quoteRepository = quoteRepository;
        this.quoteMapper = quoteMapper;
    }

    @Override
    public Mono<Quote> getQuote(UUID id) {
        return quoteRepository.getQuoteById(id);
    }
}
