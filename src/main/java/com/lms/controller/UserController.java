package com.lms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.bean.User;
import com.lms.service.UserService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class UserController {
		@Autowired
		UserService service;

		// Insert in SB with Angular Integration
		@PostMapping("/performUserinsert")
		public void performInsert(@RequestBody User user) {
			service.insertUser(user);
		}

		// Update in SB with Angular Integration
		@PutMapping("/performUserUpdate")
		public void performUpdate(@RequestBody User user) {
			service.insertUser(user);
		}

		// Delete in SB with Angular Integration
		@DeleteMapping("/performUserDelete/{id}")
		public void performDelete(@PathVariable("id") long id) {
			service.deleteUser(id);
		}

		@GetMapping("/ViewAllUsers")
		public List<User> getAll() {
			Iterator<User> it =  service.getAll().iterator();
			List<User> list = new ArrayList<>();
			while(it.hasNext()) {
				list.add(it.next());
			}
			return list;
		}

}
