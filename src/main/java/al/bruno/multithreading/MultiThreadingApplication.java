package al.bruno.multithreading;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MultiThreadingApplication {

	public static ConfigurableApplicationContext context;

	public static void main(String[] args) {

		SpringApplicationBuilder builder = new SpringApplicationBuilder(MultiThreadingApplication.class);
		builder.headless(false);
		context = builder.run(args);
	}

}
