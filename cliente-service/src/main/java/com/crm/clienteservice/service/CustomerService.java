
package com.crm.clienteservice.service;

import com.crm.clienteservice.config.RestTemplateConfig;
import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.foreignclients.HolaClient;
import com.crm.clienteservice.model.Departamento;
import com.crm.clienteservice.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    RestTemplate restTemplate;
    
    @Autowired
    HolaClient holaClient;
    
    public Page<CustomerDTO> getAll(Pageable pageable){
        return customerRepository.getAll(pageable);
    }
    
    public List<Departamento> getDepartamento(){
        //return restTemplate.getForObject("http://localhost:8083/departamento/all", List.class);
        return null;
    }
    
    public Departamento saveDepartamento(Departamento departamento){
        //return  restTemplate.postForObject("http://localhost:8083/departamento/save", departamento, Departamento.class);
        //Otra forma de realizar esta accion con una interface 
        //return  holaClient.save(departamento);
        return null;
    }
}
