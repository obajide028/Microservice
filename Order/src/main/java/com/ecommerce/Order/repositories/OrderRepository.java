package com.ecommerce.Order.repositories;

import com.ecommerce.Order.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
