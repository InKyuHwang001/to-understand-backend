package hello.hellojavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class HelloJavaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloJavaspringApplication.class, args);
	}



}
