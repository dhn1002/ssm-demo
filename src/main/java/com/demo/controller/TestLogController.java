package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dong
 * @date 2018/1/26
 */
@Controller
public class TestLogController {
    private static final Logger logger = LoggerFactory.getLogger(TestLogController.class);

    @RequestMapping("/log")
    public void test(){
        logger.trace("log trace");
        logger.debug("log debug");
        logger.info("log info");
        logger.warn("log warn");
        logger.error("log error");
    }
}
