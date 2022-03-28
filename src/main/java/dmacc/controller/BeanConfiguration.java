package dmacc.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

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
	LocalDate bd = LocalDate.of(1996, 9, 30);
	Date bd1 = convertToDateUsingDate(bd);
	@Bean
	public User user() {
		User bean = new User("darthswiftee", bd1);
		return bean;
	}
	
	@Bean
	public Computer cpu() {
		Computer bean = new Computer("Windows", "Intel i7", 16, 1500);
		return bean;
	}
	
	public static Date convertToDateUsingDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }
}
