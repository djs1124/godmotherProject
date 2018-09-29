package com.lgm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lgm.dao.UserDao;
import com.lgm.model.Admin;
import com.lgm.model.Salary;
import com.lgm.model.User;
import com.lgm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;
	
	@Override
	public boolean loginAdmin(Admin admin) {
		boolean result = false;
		if(userDao.loginAdmin(admin)!=null){
			result = true;
		}
		return result;
	}
	

	@Override
	public boolean loginUser(User user) {
		boolean result = false;
		if(userDao.loginUser(user) != null&& userDao.loginUser(user).getuStatic()!=0){
			result =  true;
		}
		return result;
	}


	@Override
	public boolean addUser(User user) {
		boolean result = false;
		if(userDao.addUser(user)!=0){
			result = true;
		}
		return result;
	}


	@Override
	public List<User> getUsers() {
	
		return userDao.getUsers();
	}


	@Override
	public List<Salary> getSalary() {
		return userDao.getSalary();
	}







	

}
