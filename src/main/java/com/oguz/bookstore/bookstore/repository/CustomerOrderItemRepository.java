package com.oguz.bookstore.bookstore.repository;

import com.oguz.bookstore.bookstore.entitiy.CustomerOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderItemRepository extends JpaRepository<CustomerOrderItem, Long> {
}
