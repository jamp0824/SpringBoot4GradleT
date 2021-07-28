package com.testing.xlt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class XltTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(XltTestingApplication.class, args);
	}
	 /*
     * 사용자 언어 환경을 설정해주기 위한 bean 설정
     */
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.ENGLISH);      // <---- 해당 값을 수정하여 언어 결정
        return sessionLocaleResolver;
    }
}
