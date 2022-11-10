package com.simplilearn.estore.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table( name = "SHIPMEMNTS")
public class Shipments {

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shipmentId;
	
	@Column(name = "orderId")
	private int orderId;
	
	@Column(name = "shipmentStatus")
	private int shipmentStatus;
	
	@Column(name = "shipmemtTitle")
	private String shipmentTitle;
	
	@Column(name ="shipmentDate")
	private Date shipmentDate;
	
	@Column(name = "expectedDeliveryDate")
	private Date expectedDeliveryDate;
	
	@Column(name = "shipmentMethod")
	private String shipmentMethod;
	
	@Column(name = "shipmentCompany")
	private String shipmentCompany;
	
	
	
}

