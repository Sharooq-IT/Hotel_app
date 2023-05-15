package com.hotelapp.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.rest.entities.Hotel;
import com.hotelapp.rest.entities.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
