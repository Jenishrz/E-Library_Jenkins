package com.lms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.bean.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
