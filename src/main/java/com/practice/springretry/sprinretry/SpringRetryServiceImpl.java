package com.practice.springretry.sprinretry;

import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Service;

@Service
public class SpringRetryServiceImpl implements SpringRetryService {

    @Override
    public String test(String a1) throws RuntimeException {
        System.out.println("Executing test method !");
        try{
            throw new Exception("wantedly throwing an exception");
        } catch(Exception e){
            throw new RuntimeException("Trying out spring retry!!");
        } finally {
            System.out.println("In final method");
        }
    }

    @Recover
    public String testFallback(RuntimeException re, String a){
        System.out.println("In recover fallback ethod!!");
        return "Recovered";
    }
}
