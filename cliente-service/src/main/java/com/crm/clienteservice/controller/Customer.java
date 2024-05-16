
package com.crm.clienteservice.controller;

import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Customer {
    
     @Autowired
    private CustomerService customerService;
    
    @GetMapping("all")
    public ResponseEntity<Page<CustomerDTO>> getAll(Pageable pageable){
        return new ResponseEntity<>(customerService.getAll(pageable), HttpStatus.OK);
    }
    
}
