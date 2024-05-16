package com.crm.clienteservice.crud;

import com.crm.clienteservice.entity.Customer;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface CustomerCrud extends JpaRepository<Customer,Integer> {

    Page<Customer> findAll(Pageable pageable);
    Optional<Customer> findByFirstName(String firstName);

}
