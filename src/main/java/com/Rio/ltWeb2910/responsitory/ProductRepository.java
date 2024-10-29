package com.Rio.ltWeb2910.responsitory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Rio.ltWeb2910.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
