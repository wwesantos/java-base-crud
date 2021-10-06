package com.example.quote.mapper.impl;

import com.example.quote.mapper.QuoteMapper;
import com.example.quote.model.quotation.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

@Component
public class QuoteMapperImpl implements QuoteMapper {

    private final ObjectMapper objectMapper;

    public QuoteMapperImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @SneakyThrows
    @Override
    public Quote mapRow(ResultSet resultSet){
        return objectMapper.readValue(resultSet.getString("body"), Quote.class);
    }
}
