package com.abhishek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
