package com.example.quote.repository.impl;

import com.example.quote.mapper.QuoteMapper;
import com.example.quote.model.quotation.Quote;
import com.example.quote.repository.QuoteBlockingRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.UUID;

import static com.example.quote.repository.impl.QuoteJdbcRepository.QueryContainer.SELECT_QUOTE_BY_ID;

public class QuoteJdbcRepository implements QuoteBlockingRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final ObjectMapper objectMapper;
    private final QuoteMapper entityMapper;

    public QuoteJdbcRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate,
                               ObjectMapper objectMapper,
                               QuoteMapper entityMapper) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.objectMapper = objectMapper;
        this.entityMapper = entityMapper;
    }

    @Override
    public Quote findById(UUID uuid) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("quote_id", uuid);
        return namedParameterJdbcTemplate.queryForObject(SELECT_QUOTE_BY_ID.query, parameterSource,
                (rs, rowNum) -> entityMapper.mapRow(rs));
    }

    enum QueryContainer {
        SELECT_QUOTE_BY_ID("SELECT * FROM quote WHERE quote_id = :quote_id::uuid");

        private final String query;

        QueryContainer(String query) {
            this.query = query;
        }
    }
}
