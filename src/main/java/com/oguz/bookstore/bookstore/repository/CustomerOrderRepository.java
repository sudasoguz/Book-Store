package com.oguz.bookstore.bookstore.repository;

import com.oguz.bookstore.bookstore.entitiy.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
}
