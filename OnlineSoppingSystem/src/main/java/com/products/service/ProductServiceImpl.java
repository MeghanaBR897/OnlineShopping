package com.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.Model.Products;
import com.products.Repository.ProductsRepository;
@Service
public abstract class ProductServiceImpl implements IProduct {
	@Autowired
	 ProductsRepository dao;
	 public Products addProducts(Products products) {
		
	Products product=dao.save(products);
	
		return products;
	}
	 
	

		
		  
		  
		  
		  
	
		 	
}
