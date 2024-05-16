
package com.crm.holaservice.mapper;

import com.crm.holaservice.dto.DepartamentoDTO;
import com.crm.holaservice.entity.Departamento;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartamentoMapper {
    
    DepartamentoDTO todDepartamentoDTO(Departamento departamento);
    List<DepartamentoDTO> todDepartamentoDTOs(List<Departamento> departamentos);
    
    @InheritInverseConfiguration
    Departamento toDepartamento(DepartamentoDTO departamentoDTO);
}
