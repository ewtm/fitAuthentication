package br.com.fit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FitApplication {

	@RequestMapping("/")
	String home() {
		return "<style>"
				+ "h1{text-align:center;}"
				+ "</style>"
				+ "<h1>Hello Fit</h1>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FitApplication.class, args);
	}

}
