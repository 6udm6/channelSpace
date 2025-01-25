package com.channelspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//초기실행 로그인화면 제거
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ChannelSpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChannelSpaceApplication.class, args);
	}

}
