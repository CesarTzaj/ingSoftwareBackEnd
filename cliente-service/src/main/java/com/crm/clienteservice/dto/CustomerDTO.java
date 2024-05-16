package com.crm.clienteservice.dto;

import com.crm.clienteservice.model.Departamento;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDTO {
    Integer customerId;
    String firstName;
    String middleName;
    String lastName;
    String secondLastName;
    String street;
    String condominium;
    String email;
    String nit;
    
}
