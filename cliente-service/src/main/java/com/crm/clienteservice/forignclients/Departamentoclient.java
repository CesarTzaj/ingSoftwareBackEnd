
package com.crm.clienteservice.forignclients;

import com.crm.clienteservice.model.Departamento;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "hola-service")
//@RequestMapping("/departamento")
public interface Departamentoclient {
     @PostMapping("departamento/save")
    Departamento save( Departamento departamento);
}
