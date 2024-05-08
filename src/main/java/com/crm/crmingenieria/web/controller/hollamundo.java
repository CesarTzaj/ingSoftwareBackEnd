
package com.crm.crmingenieria.web.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class hollamundo {
 
    
    @GetMapping("/hola")
    public String getAll(){
        return "hola munodo";
    }
}
