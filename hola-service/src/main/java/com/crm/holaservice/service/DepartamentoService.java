
package com.crm.holaservice.service;

import com.crm.holaservice.dto.DepartamentoDTO;
import com.crm.holaservice.repository.DepartamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {
    
    @Autowired
    private DepartamentoRepository repository;
    
    public List<DepartamentoDTO> getAll(){
        return repository.getall();
    }
    
    public DepartamentoDTO save(DepartamentoDTO departamentoDTO){
        return repository.save(departamentoDTO);
    }
}
