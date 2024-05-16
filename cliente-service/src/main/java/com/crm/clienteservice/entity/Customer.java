package com.crm.clienteservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer customerId;
    String firstName;
    String middleName;
    String lastName;
    String secondLastName;
    String street;
    String condominium;
    String email;

    @Column(name = "NIT")
    String nit;

}
