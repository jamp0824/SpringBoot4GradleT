package com.testing.xlt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.xlt.exception.ForbiddenException;

@RestController
public class ErrorPageController {

	@GetMapping("/internalerror")
	public void internalerror() {
		throw new RuntimeException("500 Internal Error !!");
	}
	
	@GetMapping("/forbidden")
	public void forbidden() {
		throw new ForbiddenException("403 Forbidden !!");
	}
}
