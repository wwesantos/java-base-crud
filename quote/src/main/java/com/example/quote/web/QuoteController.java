package com.example.quote.web;

import com.example.quote.model.quotation.Quote;
import com.example.quote.service.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class QuoteController {

    final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quote/{uuid}")
    Mono<Quote> getQuote(@PathVariable UUID uuid) {
        return quoteService.getQuote(uuid);
    }

    /* Create new endpoints */

    /*
    1 - to return all quotes in the database
        @GetMapping("/quote")
    */

    /*
    2 - to add create a quote and return entry
        @PostMapping("/quote")
    */

    /*
    3 - to modify a quote
        @PutMapping("/quote")
    */

    /*
    4 - to delete a quote
        @DeleteMapping("/quote/{uuid}")
     */
}
