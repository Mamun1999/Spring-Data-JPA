package com.mamun.jpa;

import com.mamun.jpa.model.Laptop;
import com.mamun.jpa.model.User;
import com.mamun.jpa.repository.LaptopRepository;
import com.mamun.jpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {


		ApplicationContext context= SpringApplication.run(SpringDataJpaApplication.class, args);

	    UserRepository userRepository=context.getBean(UserRepository.class);
	    LaptopRepository laptopRepository=context.getBean(LaptopRepository.class);


	        User user1=new User(101,"mamun");

			User user2=new User(102,"Naim");

			//-----One to One Relation with User and Laptop

//		    Laptop laptop1=new Laptop(501, "Lenevo");
//			Laptop laptop2=new Laptop(502,"Apple");
//			Laptop laptop3=new Laptop(503,"HP");
//
//			user1.setLaptop(laptop1);
//			user2.setLaptop(laptop3);
//
//			userRepository.save(user1);
//			userRepository.save(user2);






	}





}
