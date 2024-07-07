package com.bullbearybots.ecommerce.dao;

import com.bullbearybots.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(value = "http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
