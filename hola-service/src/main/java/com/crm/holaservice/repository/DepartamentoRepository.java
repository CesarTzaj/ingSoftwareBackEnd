
package com.crm.holaservice.repository;

import com.crm.holaservice.crud.DepartamentoCrud;
import com.crm.holaservice.dto.DepartamentoDTO;
import com.crm.holaservice.entity.Departamento;
import com.crm.holaservice.mapper.DepartamentoMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoRepository {
    
    @Autowired
    private DepartamentoCrud crud;
    
    @Autowired
    private DepartamentoMapper mapper;
    
    public List<DepartamentoDTO> getall(){
        List<Departamento> departamentos = crud.findAll();
        return mapper.todDepartamentoDTOs(departamentos);
    }
     
    public DepartamentoDTO save(DepartamentoDTO departamentoDTO){
        return mapper.todDepartamentoDTO(crud.save(mapper.toDepartamento(departamentoDTO)));
    }
}
