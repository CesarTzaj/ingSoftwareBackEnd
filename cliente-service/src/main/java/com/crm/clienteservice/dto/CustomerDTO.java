package com.crm.clienteservice.dto;

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
