package com.sravan.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sravan.products.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,String>{
	
	// Fetch products by brand
	@Query("select p from Product p where p.brand = ?1")
	List<Product> findByBrand(String brand);
	
	// Fetch products by name and type
	@Query("select p from Product p where p.name = ?1 and p.type = ?2")
	List<Product> findByNameAndType(String name, String type);

}
