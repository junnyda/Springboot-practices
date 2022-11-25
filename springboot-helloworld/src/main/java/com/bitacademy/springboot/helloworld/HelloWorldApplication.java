package com.bitacademy.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 스프링 애플리케이션의 부트스트래핑 역활(Bootstraping Class)
 * 2. 설정 클래스 역할(Configuration Class)
 *
 */
@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {
		/**
		 * 1. 애플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 */
		SpringApplication.run(HelloWorldApplication.class, args);

	}

}