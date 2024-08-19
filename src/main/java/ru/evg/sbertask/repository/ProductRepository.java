package ru.evg.sbertask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.evg.sbertask.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
