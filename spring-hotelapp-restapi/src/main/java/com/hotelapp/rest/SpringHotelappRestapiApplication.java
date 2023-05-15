package com.hotelapp.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.rest.entities.Address;
import com.hotelapp.rest.entities.Delivery;
import com.hotelapp.rest.entities.Hotel;
import com.hotelapp.rest.entities.Menu;
import com.hotelapp.rest.service.HotelService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}

	@Autowired
	HotelService hotelService;

	@Override
	public void run(String... args) throws Exception {
		Address address = new Address("ABC nagar", "Bangalore", 564789, "KAR");
		Menu menu1 = new Menu("Parata", 20);
		Menu menu2 = new Menu("Pizza", 30);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
		Delivery del1 = new Delivery("Swiggy", 120);
		Delivery del2 = new Delivery("Uber", 140);
		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1, del2));
		Hotel hotel = new Hotel("A2B", address, menuList, deliveryList);
		hotelService.addHotel(hotel);

	}

}
