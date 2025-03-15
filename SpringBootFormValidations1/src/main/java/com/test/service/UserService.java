package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	private static  List<User> tempData = new ArrayList<>();
	
	static
	{
		String[] food = {"BreakFast", "Lunch", "Dinner"};
		String[] seat = {"M1", "M2", "L1", "L2", "U1","U2"};
		
		tempData.add(new User("Rohit", "Sharma", "male", food,
				"Chennai", "Banglore", seat, "15/03/2025"));
	}
	
	public User reservationRequest(User user)
	{
		tempData.add(user);
		
		return repository.save(user);
	}
	
	public boolean validateCity(User user)
	{
		boolean ft = user.validate(user.getCityFrom(), user.getCityTo());
		
		return ft;
	}
}
