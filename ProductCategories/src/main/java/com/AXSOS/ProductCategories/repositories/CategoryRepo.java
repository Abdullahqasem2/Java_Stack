package com.AXSOS.ProductCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AXSOS.ProductCategories.models.Category;
import com.AXSOS.ProductCategories.models.Product;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
	
}
