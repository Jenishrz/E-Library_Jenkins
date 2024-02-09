package com.lms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.lms.bean.User;
import com.lms.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;
	
	public boolean insertUser(User user) {
		repo.save(user);
		return true;
	}
	public boolean updateUser(User user) {
		repo.save(user);
		return true;
	}
	public boolean deleteUser(@PathVariable("id") long id) {
		repo.deleteById(id);
		return true;
	}


	public List<User> getAll() {
		Iterator<User> it =  repo.findAll().iterator();
		List<User> list = new ArrayList<>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
