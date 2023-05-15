package com.hotelapp.rest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(generator = "add_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "add_id", sequenceName = "address_id")
	private Integer addressId;
	private String streetName;
	private String city;
	private long zipCode;
	private String state;
	
	public Address(String streetName, String city, long zipCode, String state) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", zipCode=" + zipCode + ", state=" + state
				+ "]";
	}
	
	
	
	
	
}
