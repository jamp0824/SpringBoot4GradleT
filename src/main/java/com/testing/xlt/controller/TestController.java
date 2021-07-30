package com.testing.xlt.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	private final Logger logger = LogManager.getLogger(this.getClass());
	
	@RequestMapping(value="/test1")
	public ModelAndView test() throws Exception{
		logger.trace("Trace level 테스트");
		logger.debug("DEBUG Level 테스트");
		logger.info("INFO level 테스트");
		logger.warn("INFO level 테스트");
		logger.error("INFO level 테스트");
		
		return null;
	}
}
