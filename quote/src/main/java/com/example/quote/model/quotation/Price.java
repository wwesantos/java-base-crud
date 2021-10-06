package com.example.quote.model.quotation;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Price implements Serializable {
    BigDecimal taxIncludedAmount;
}
