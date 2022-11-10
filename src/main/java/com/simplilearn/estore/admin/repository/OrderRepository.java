package com.simplilearn.estore.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.admin.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
