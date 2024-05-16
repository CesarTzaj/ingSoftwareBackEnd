
package com.crm.clienteservice.repository;

import com.crm.clienteservice.crud.CustomerCrud;
import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.entity.Customer;
import com.crm.clienteservice.mapper.CustomerMapper;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;



@Repository
public class CustomerRepository{

    @Autowired
    private CustomerCrud crud;

    @Autowired
    private CustomerMapper mapper;

    public Page<CustomerDTO> getAll(Pageable pageable){
        Page<Customer> customers = crud.findAll(pageable);
        List<CustomerDTO> customerDTOs = mapper.toCustomerDtos(customers.getContent());
        return new PageImpl<>(customerDTOs, pageable,customers.getTotalPages());
    }
}
