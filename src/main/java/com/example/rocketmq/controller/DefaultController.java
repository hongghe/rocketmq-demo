package com.example.rocketmq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongghe 2018/11/18
 */
@RestController
@Slf4j
@RequestMapping(value = "/error")
public class DefaultController {

    @RequestMapping(value = "404")
    public void NotFoundPage() {
        return;
    }
}
