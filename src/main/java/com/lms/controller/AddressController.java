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

import com.lms.bean.Address;
import com.lms.service.AddressService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class AddressController {
	@Autowired
	AddressService service;

	// Insert in SB with Angular Integration
	@PostMapping("/performinsertAddress")
	public String performInsertAddress(@RequestBody Address address) {
		service.insertAddress(address);
		return "Instered";
	}
	@PutMapping("/performAddressUpdate")
	public void performUpdateAddress(@RequestBody Address address) {
		service.insertAddress(address);
	}
	@DeleteMapping("/performAddressDelete/{id}")
	public void performDeleteAddress(@PathVariable("id") long id) {
		service.deleteAddress(id);
	}
	
	@GetMapping("/ViewAllAddresss")
	public List<Address> getAll() {
		Iterator<Address> it =  service.getAll().iterator();
		List<Address> list = new ArrayList<>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}


}
