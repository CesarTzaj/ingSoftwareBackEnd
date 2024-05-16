
package com.crm.clienteservice.service;

import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    public Page<CustomerDTO> getAll(Pageable pageable){
        return customerRepository.getAll(pageable);
    }
}
