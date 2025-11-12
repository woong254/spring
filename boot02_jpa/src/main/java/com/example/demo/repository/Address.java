package com.example.demo.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String zipcode;
	private String address;
	private String detail_adress;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	Customer customer;
	
	@Builder
	public Address(String zipcode, String address, String detail_adress, Customer customer) {
		super();
		this.zipcode = zipcode;
		this.address = address;
		this.detail_adress = detail_adress;
		this.customer = customer;
	}
}
