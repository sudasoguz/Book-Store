package com.oguz.bookstore.bookstore.repository;

import com.oguz.bookstore.bookstore.entitiy.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
