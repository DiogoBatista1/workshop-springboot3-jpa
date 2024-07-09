package com.educandoweb.course.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
