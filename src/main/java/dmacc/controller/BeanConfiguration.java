package dmacc.controller;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.User;

/**
 * @author dynob - tjmendenhall2@dmacc.edu
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public User user() {
		User bean = new User("darthswiftee", LocalDate.of(1996, 9, 30));
		return bean;
	}
	
	@Bean
	public Computer cpu() {
		Computer bean = new Computer("Windows", "Intel i7", 16, 1500);
		return bean;
	}
}
