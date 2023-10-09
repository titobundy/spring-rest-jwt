package com.hdiaz.demo;

import com.hdiaz.demo.user.User;
//import com.hdiaz.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class);
	}

//	@Bean
//	public CommandLineRunner demo(UserRepository repository) {
////		System.out.println("Enter key!");
////		Scanner scanner = new Scanner(System.in);
////		String line = scanner.nextLine();
////		System.out.println(line);
//
//		return (args) -> {
//			// save a few customers
//			repository.save(new User("Jack", "Bauer 2"));
//			repository.save(new User("Chloe", "O'Brian"));
//			repository.save(new User("Kim", "Bauer"));
//			repository.save(new User("David", "Palmer"));
//			repository.save(new User("Michelle", "Dessler"));
//
//			// fetch all customers
//			log.info("Users found with findAll():");
//			log.info("-------------------------------");
//			for (User user : repository.findAll()) {
//				log.info(user.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			User user = repository.findById(1L);
//			log.info("User found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(user.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("User found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (User bauer : repository.findByLastName("Bauer")) {
//			// 	log.info(bauer.toString());
//			// }
//			log.info("");
//		};
//	}

}
