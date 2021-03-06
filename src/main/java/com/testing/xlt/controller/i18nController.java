package com.testing.xlt.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class i18nController {

	private final Logger logger = LogManager.getLogger(this.getClass());

    @GetMapping("/test")
    public String test() {
    	logger.trace("Trace level 테스트");
		logger.debug("DEBUG Level 테스트");
		logger.info("INFO level 테스트");
		logger.warn("INFO level 테스트");
		logger.error("INFO level 테스트");
		
        return "test";
    }
}