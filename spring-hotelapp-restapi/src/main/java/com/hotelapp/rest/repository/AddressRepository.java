package com.hotelapp.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.rest.entities.Address;
import com.hotelapp.rest.entities.Hotel;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
