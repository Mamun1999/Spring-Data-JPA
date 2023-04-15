package com.mamun.jpa;

import com.mamun.jpa.model.*;
import com.mamun.jpa.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
	    UserRepository userRepository=context.getBean(UserRepository.class);
	    CategoryRepository categoryRepository=context.getBean(CategoryRepository.class);
		PostRepository postRepository=context.getBean(PostRepository.class);
	    LaptopRepository laptopRepository=context.getBean(LaptopRepository.class);

	    User2Repo user2Repo = context.getBean(User2Repo.class);


	    Category category=	categoryRepository.getCategoryInfo(301);
//		List<User> users=	category.getUsers();
		System.out.println(category.getCategoryTitle());
		List<User> users=category.getUsers();
				for(User user:users){
					System.out.println(user);
				}

//		System.out.println(Arrays.toString(users.toArray()));


//        List<String> posts= postRepository.getDetails();
//
//		System.out.println(Arrays.toString(posts.toArray()));



//		Post post=postRepository.getByPostId(201);
//		Post post2=postRepository.getByPostId(201);



//		System.out.println(post.getUser());
//	    Laptop laptop=	user.getLaptop();
//		System.out.println(post);
//		System.out.println(post2);
//		System.out.println(laptop);

		//join query--------------------

//	    List<String> laptopusers = userRepository.findByUserNameAndLaptopName();
//
//		System.out.println(Arrays.toString(laptopusers.toArray()));

//	    List<User> users=userRepository.findByAllUser();
//		System.out.println(Arrays.toString(users.toArray()));

//		List<User2> users2= (List<User2>) user2Repo.findByAgeBetween(5,10);

//		List<User2> user2s= user2Repo.findByNameAndAge("mahi",2 );


//		System.out.println(Arrays.toString(user2s.toArray()));


		//-------Custom finder method start-------------------------------------------



//		List<User> users= (List<User>) userRepository.findByUserName("Nitu");
//       List<User>users=  userRepository.findByUserNameStartingWith("m");
//		List<User>users=  userRepository.findByUserNameLike("m%");
//		List<User> users=userRepository.findByUserNameContaining("n");
//		for(User user: users){
//			System.out.println(user);
//		}




//	        User user1=new User(101,"mamun");
//
//			User user2=new User(102,"Naim");
//
//			User user3=new User(103,"Nitu");
//
//
//
//		User user4=new User(104,"Sourav");

		// ------------many to many many start---------------

//		Category category1=new Category(301, "Football");
//		Category category2=new Category(302, "Cricket");
//		Category category3=new Category(303, "Tennis");
//		Category category4=new Category(304, "BasketBall");

//		 List<User> category1user= category1.getUsers(); //here type casting s not need bcs List is bigger than a object
//		 category1user.add(user1);
//		 category1user.add(user3);
//
//		List<User> category2user = category2.getUsers();
//		category2user.add(user2);
//		category2user.add(user4);
//
//		List<User> category3user = category3.getUsers();
//		category3user.add(user1);
//		category3user.add(user4);
//		category3user.add(user3);
//
//
//		List<User> category4user = category4.getUsers();
//		category4user.add(user1);
//		category4user.add(user3);
//
//		categoryRepository.save(category1);
//		categoryRepository.save(category2);
//		categoryRepository.save(category3);
//		categoryRepository.save(category4);






//--------------------Many to many end-------------------------------------------------



//--------------one to many start----------------------------------------
//	    	Post post1=new Post(201,"Laliga");
//
//		    Post post2=new Post(202,"Bundeslia");
//
//		    Post post3=new Post(203,"Pl");
//
//		    Post post4=new Post(204,"Ligue1");
//
//			post1.setUser(user1);
//			post2.setUser(user1);
//			post3.setUser(user2);
//			post4.setUser(user2);
//
//            postRepository.save(post1);
//		    postRepository.save(post2);
//		    postRepository.save(post3);
//		    postRepository.save(post4);
//
//	     Post post=	postRepository.findById(201).get();
////		 User user= post.getUser();
//		System.out.println(post.getTitle());




//          User user= userRepository.findById(101).get();
//
//		System.out.println(user);
//		List<Post>posts= user.getPostList();
//		 for (Post post: posts){
//			 System.out.println(post);
//		 }
////		System.out.println(Arrays.toString(posts.toArray()));

 //  ========ont to many finshed----------------------------------

			//  One to one------------------------------------------------------------------------
//			User user3=new User(103,"Nitu");
//			User user4=new User(104,"Sourav");
//	       	User user5=new User(105,"Rokon");



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
//
//		User user = userRepository.findById(105).get();
//	    Laptop laptop =	user.getLaptop();
//		System.out.println(user);
//		System.out.println(laptop);


//		--- one to one finishes------------------------------------------------------






	}





}
