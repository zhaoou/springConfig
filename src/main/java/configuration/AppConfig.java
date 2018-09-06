package configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Bread;
import beans.Cheese;
import beans.Coudiment;
import beans.Ketchup;
import beans.RyeBread;
import beans.Salami;
import beans.Sandwich;

@Configuration
public class AppConfig {
	
	@Bean
	//@Autowired
	public Sandwich msandwich(
			Bread bread,
			@Qualifier("cheese") Coudiment one,
			@Qualifier("ketchup") Coudiment two,
			@Qualifier("salami") Coudiment three
			) {
		
		Sandwich sandwich = new Sandwich(one, two, three);
		sandwich.setTheBread(ryeBread());
		return sandwich;
	}
	
	
	@Bean
	public Coudiment cheese() {
		return new Cheese();
	}
	
	@Bean
	public Coudiment ketchup() {
		return new Ketchup();
	}
	
	@Bean
	public Coudiment salami() {
		return new Salami();
	}
	
	@Bean
	public Bread ryeBread() {
		return new RyeBread();
	}

}
