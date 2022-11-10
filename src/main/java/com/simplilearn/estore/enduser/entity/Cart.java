package com.simplilearn.estore.enduser.entity;

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
@Table( name = "CART")
public class Cart {

	
	@Column(name = "cartId")
	private int cartId;
	
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "quantity")
	private int quantity;

	

}
