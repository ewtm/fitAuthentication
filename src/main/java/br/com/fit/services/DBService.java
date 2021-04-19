package br.com.fit.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fit.model.User;
import br.com.fit.repository.UserRepository;

@Service
public class DBService {
	
	/*
	@Autowired
	private BCryptPasswordEncoder pe;*/

	@Autowired
	private UserRepository userRepository;
	
	public void instantiateTestDatabase() throws ParseException{
		
		User us1 = new User(null,"Eduardo","ewtm@msn.com","123");
		User us2 = new User(null,"Wilkson","eng.wilksoncardoso@gmail.com","123");
		User us3 = new User(null,"Sinval","sinval.msjunior@gmail.com","123");
		
		userRepository.saveAll(Arrays.asList(us1,us2,us3));
		
	}
	
}
