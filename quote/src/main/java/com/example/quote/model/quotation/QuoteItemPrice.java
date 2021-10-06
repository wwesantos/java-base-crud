package com.example.quote.model.quotation;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuoteItemPrice implements Serializable {
    String priceType;
    Price price;
    String priceCurrency;
}
