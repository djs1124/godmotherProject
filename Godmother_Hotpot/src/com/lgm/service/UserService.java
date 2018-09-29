package com.lgm.service;

import java.util.List;

import com.lgm.model.Admin;
import com.lgm.model.Salary;
import com.lgm.model.User;

public interface UserService {
	
	public boolean loginAdmin(Admin admin);
	
	public boolean loginUser(User user);
	
	public boolean addUser(User user);
	
	public List<User> getUsers();
	
	public List<Salary> getSalary();
}
