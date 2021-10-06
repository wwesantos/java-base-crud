package com.example.quote.config.postgres;

import com.example.quote.mapper.QuoteMapper;
import com.example.quote.repository.QuoteBlockingRepository;
import com.example.quote.repository.impl.QuoteJdbcRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class PostgresBlockingRepositories {

    @Bean
    public QuoteBlockingRepository quoteBlockingRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate,
                                                            ObjectMapper objectMapper,
                                                            QuoteMapper quoteMapper) {
        return new QuoteJdbcRepository(namedParameterJdbcTemplate, objectMapper, quoteMapper);
    }
}
