
package com.crm.clienteservice.controller;

import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.model.Departamento;
import com.crm.clienteservice.service.CustomerService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Customer {
    
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("all")
    public ResponseEntity<Page<CustomerDTO>> getAll(Pageable pageable){
        return new ResponseEntity<>(customerService.getAll(pageable), HttpStatus.OK);
    }
    /*
    @GetMapping("departamento/all")
    public ResponseEntity<List<Departamento>> getAllDepartamento(){
        return ResponseEntity.ok(customerService.getDepartamento());
    }
        
    @PostMapping("save/departamento")
    public ResponseEntity<Departamento> save(@RequestBody Departamento departamento){
        return ResponseEntity.ok(customerService.saveDepartamento(departamento));
    }
    */
}
