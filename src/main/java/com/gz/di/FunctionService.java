package com.gz.di;

import org.springframework.stereotype.Service;

/**
 * @author xiaozefeng
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}
