package com.social.media.application.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	//for storing data we'll use static List
	private static List<User> userList = new ArrayList<>();
	
	static {
		
		userList.add(new User(1,"Harsha",LocalDate.now().minusYears(10)));
		userList.add(new User(2,"Roshni",LocalDate.now().minusYears(20)));
		userList.add(new User(3,"Kiran",LocalDate.now().minusYears(30)));
		userList.add(new User(4,"Sharradha",LocalDate.now().minusYears(40)));
	}
	
	public List<User> findAll() {
		return userList;
	}
	
	//public User save(User user)
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user ->user.getUser_id().equals(id);
		return userList.stream().filter(predicate).findFirst().get();
		
	}
	
	
	

}
