
package com.crm.holaservice.controller;

import com.crm.holaservice.dto.DepartamentoDTO;
import com.crm.holaservice.service.DepartamentoService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departamento")
public class Departamento {
    
    @Autowired
    private DepartamentoService service;
    
    @GetMapping("all")
    public ResponseEntity<List<DepartamentoDTO>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("save")
    public ResponseEntity<DepartamentoDTO> save(@RequestBody DepartamentoDTO departamentoDTO){
        return ResponseEntity.ok(service.save(departamentoDTO));
    }
}
