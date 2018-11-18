package com.example.rocketmq.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author hongghe 2018/11/18
 */
@Service
@Slf4j
public class DefaultService {

    public void defaultMethod() {
        log.info("The name of history.");
    }
}
