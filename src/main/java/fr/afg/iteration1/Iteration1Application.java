package fr.afg.iteration1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



//NB: @SpringBootApplication est un équivalent
//de @Configuration + @EnableAutoConfiguration + @ComponentScan/current package
@SpringBootApplication
//NB: via le @EnableAutoConfiguration, application.properties sera analysé
//NB: cette classe doit être dans tp pour que le @ComponentScan automatique
//scrute tous les sous packages tp.dao, tp.service ,
@EnableJpaRepositories(basePackages = "fr.afg.iteration1.dao")
public class Iteration1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		// SpringApplication.run(Iteration1Application.class, args);
		SpringApplication app = new SpringApplication(Iteration1Application.class);
		app.setAdditionalProfiles("initData");
		ConfigurableApplicationContext context = app.run(args);
		System.out.println("http://localhost:8093/login");
	}
}