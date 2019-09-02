package com.sravan.products.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sravan.products.domain.Product;
import com.sravan.products.domain.ProductUser;

@Repository
public interface ProductUserRepository extends CrudRepository<ProductUser,String>{

	ProductUser findByUsername(String username);
}
