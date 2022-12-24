package telran.java45;


import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}
	
	@Bean	
	public Consumer<String> firstconsumer() {
	    return  value -> {System.out.println("Received: " + value);};
	 
	}

}
