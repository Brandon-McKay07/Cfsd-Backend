package com.simplilearn.estore.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table( name = "USERS")
public class Users {

	
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "fullName")
	private String fullName;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "email")
	private String country;
	
	@Column(name = "email")
	private int pincode;
	
	@Column(name = "email")
	private String image;
	
	@Column(name = "email")
	private Long contact;
	
	@Column(name = "email")
	private Date addedOn;

	
	
	
	
}
