package com.example.quote.repository;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

import java.util.concurrent.Callable;

public interface ReactiveWrapper {

    default <T> Mono<T> wrapTypeMethod(Callable<T> typeMethodCallable, Scheduler scheduler) {
        return Mono.fromCallable(typeMethodCallable)
                .subscribeOn(scheduler);
    }
}
