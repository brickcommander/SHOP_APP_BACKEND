package com.brickcommander.crud.app.repository;

import com.brickcommander.crud.app.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findOneByCustomerId(Long customerId);

    // Custom query to find customers by name containing a specific substring
    List<Customer> findByNameContaining(String substring);
}
