package edu.kh.project.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @Configuration
// - 스프링 설정용 클래스임을 명시 (스프링이 해당 클래스를 설정 정보로 인식하고 사용)
// + 객체로 생성해서 내부 코드를 서버 실행시 모두 바로 실행

@Configuration 
public class SecurityConfig {
	
	// @Bean
	// - 개발자가 수동으로 생성한 객체의 관리를 
	//   스프링에게 넘기는 어노테이션 (Bean 등록)
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
