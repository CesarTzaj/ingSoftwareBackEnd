
package com.crm.clienteservice.service;

import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.forignclients.Departamentoclient;
import com.crm.clienteservice.model.Departamento;
import com.crm.clienteservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired 
    Departamentoclient departamentoclient;
            
    public Page<CustomerDTO> getAll(Pageable pageable){
        return customerRepository.getAll(pageable);
    }
    
    public Departamento saveDepartamento(Departamento departamento){
        //return  restTemplate.postForObject("http://localhost:8083/departamento/save", departamento, Departamento.class);
        //Otra forma de realizar esta accion con una interface 
        return  departamentoclient.save(departamento);
        //return null;
    }
}
