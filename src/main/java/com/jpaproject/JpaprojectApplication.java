package com.jpaproject;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpaproject.dao.UserRepo;
import com.jpaproject.entities.User;

@SpringBootApplication
public class JpaprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaprojectApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		//create and insert data
		//create object of user
		User user1=new User();
		user1.setId(51);
		user1.setName("pavan");
		user1.setCity("shendola");
		user1.setStatus("bsinessemen");
		
		User user2=new User();
		user2.setId(52);
		user2.setName("mayuro");
		user2.setCity("dhamangaon");
		user2.setStatus("house wife");
               user2.setname("pallu");
		
		
		//saving single user
//		User save = userRepo.save(user1);
//		System.out.println(save);
		
		//save multiple object
		
//		List<User> users = List.of(user1,user2);
//		
//		 Iterable<User> result = userRepo.saveAll(users);
//		 
//		 result.forEach(user->{
//			 System.out.println(users);
//		 });
//		System.out.println("done");
		
		
		//update the user id =50
//		Optional<User> optional = userRepo.findById(51);
//		
//		User user = optional.get();
//		user.setName("gaurav");
//		User updted = userRepo.save(user);
//		System.out.println(updted);
		
		//how to get the data
		//findbyid(id)-return obtional containing data
		Iterable<User> findAll = userRepo.findAll();
		findAll.forEach(e->{
			System.out.println(e);
		});
		System.out.println("***********************************");
//		List<User> users = userRepo.findByName("rakesh");
//		users.forEach(e->System.out.println(e));
//		
//		System.out.println("***********************************");
//		
//		
//		List<User> city = userRepo.findByCity("oan");
//		city.forEach(e->System.out.println(e));
		System.out.println("***********************************");
		
		List<User> allUser = userRepo.getAllUser();
		allUser.forEach(e->System.out.println(e));
		System.out.println("***********************************");
		
		List<User> r = userRepo.getUserByName("rakesh");
		r.forEach(w->System.out.println(w));
		//deleting the user element
//		userRepo.deleteById(52);
//		System.out.println("deleted");
		
	}

}
