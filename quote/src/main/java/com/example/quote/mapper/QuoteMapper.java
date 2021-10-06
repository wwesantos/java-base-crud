package com.example.quote.mapper;

import com.example.quote.model.quotation.Quote;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public interface QuoteMapper {
    Quote mapRow(ResultSet resultSet);

    default List<String> getArrayNullSafely(ResultSet resultSet, String columnLabel) throws SQLException {
        return resultSet.getArray(columnLabel) == null
                ? null
                : Arrays.asList((String[]) resultSet.getArray(columnLabel).getArray());
    }
}
