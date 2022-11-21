package com.oguz.bookstore.bookstore.repository;

import com.oguz.bookstore.bookstore.entitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
