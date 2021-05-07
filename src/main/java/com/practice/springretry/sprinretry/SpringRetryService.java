package com.practice.springretry.sprinretry;

import org.springframework.retry.annotation.Retryable;

public interface SpringRetryService {

    @Retryable
    String test(String a1) throws RuntimeException;
}
