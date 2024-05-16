
package com.crm.holaservice.crud;

import com.crm.holaservice.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartamentoCrud extends JpaRepository<Departamento, Integer>{
    
    
}
