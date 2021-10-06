package com.example.quote.model.quotation;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
public class Quote implements Serializable {
    UUID id;
    String version;
    String customerId;
    List<QuoteItem> quoteItem;
}
