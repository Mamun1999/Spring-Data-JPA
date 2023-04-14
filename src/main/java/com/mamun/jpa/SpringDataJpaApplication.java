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
			User user3=new User(103,"Nitu");
			User user4=new User(104,"Sourav");
		User user5=new User(105,"Rokon");



//			-----One to One Relation with User and Laptop

//		    Laptop laptop5=new Laptop(505, "Apple Pro");
//			Laptop laptop2=new Laptop(502,"Apple");
//			Laptop laptop3=new Laptop(503,"HP");




//            laptop5.setUser(user5);
//			user5.setLaptop(laptop5);
//		    userRepository.save(user5);

//			laptop2.setUser(user2);
//			laptop3.setUser(user3);
//            user4.setLaptop(laptop1);

//			laptopRepository.save(laptop1);
//		    laptopRepository.save(laptop2);
//			laptopRepository.save(laptop3);

		User user = userRepository.findById(105).get();
	    Laptop laptop =	user.getLaptop();
		System.out.println(user);
		System.out.println(laptop);


//		---finishes






	}





}
