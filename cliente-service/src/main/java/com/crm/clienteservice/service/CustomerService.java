package com.crm.clienteservice.service;

import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.forignclients.Departamentoclient;
import com.crm.clienteservice.model.Departamento;
import com.crm.clienteservice.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    Departamentoclient departamentoclient;

    @Autowired
    RestTemplate restTemplate;

    public Page<CustomerDTO> getAll(Pageable pageable) {
        return customerRepository.getAll(pageable);
    }

    public Departamento saveDepartamento(Departamento departamento) {
        //return  restTemplate.postForObject("http://hola-service/departamento/save", departamento, Departamento.class);
        //Otra forma de realizar esta accion con una interface 
        return departamentoclient.save(departamento);
        //return null;
    }

    public List<Departamento> getDepartamento() {
        return restTemplate.getForObject("http://hola-service/departamento/all", List.class);
    }
}
