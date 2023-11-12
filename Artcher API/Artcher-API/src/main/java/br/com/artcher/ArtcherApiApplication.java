package br.com.artcher;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ArtcherApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ArtcherApiApplication.class, args);
	}

}
