package com.example.quote.repository;

import com.example.quote.model.quotation.Quote;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QuoteBlockingRepository {
    Quote findById(UUID uuid);
}
