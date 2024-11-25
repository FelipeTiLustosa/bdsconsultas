package com.devsuperior.uri2602.repositories;

import com.devsuperior.uri2602.entities.Customer;
import com.devsuperior.uri2602.projections.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {
    @Query(nativeQuery = true,value = "SELECT name "
            + "FROM customers "
            + "WHERE state = :state")
    List<CustomerMinProjection> search1(String state);
}
