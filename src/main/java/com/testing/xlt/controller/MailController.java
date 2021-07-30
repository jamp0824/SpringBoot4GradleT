package com.testing.xlt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.testing.xlt.dto.MailDto;
import com.testing.xlt.service.MailService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;
//
    @GetMapping("/mail")
    public String dispMail() {
        return "mail";
    }
//
    @PostMapping("/mail")
    public void execMail(MailDto mailDto) {
        mailService.mailSend(mailDto);
    }
}
