package com.oguz.bookstore.bookstore.repository;

import com.oguz.bookstore.bookstore.entitiy.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

  Address findByAddressId(Long addressId);

  List<Address> findByCustomer_CustomerId(Long customerId);
}
