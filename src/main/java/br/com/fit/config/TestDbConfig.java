package br.com.fit.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.fit.services.DBService;

@Configuration
public class TestDbConfig {

	@Autowired
	public DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException{
		dbService.instantiateTestDatabase();
		return true;
	}
	
}
