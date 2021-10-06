package com.example.quote.model.quotation;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
public class QuoteItem implements Serializable {
    UUID id;
    ProductOffering productOffering;
    List<QuoteItemPrice> quoteItemPrice;
}
