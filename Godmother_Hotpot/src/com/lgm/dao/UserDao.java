package com.lgm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lgm.model.Admin;
import com.lgm.model.User;

public interface UserDao {
	
	public Admin loginAdmin(Admin admin);
	
	public User loginUser(User user);
	
	public int addUser(User user);
	
	public List<User> getUsers();
	
	
	
}
