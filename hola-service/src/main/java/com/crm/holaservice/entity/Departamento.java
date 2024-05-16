
package com.crm.holaservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "	departamento")
@Data
public class Departamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTAMENTO_ID ")
    private Integer departamentoID;
    
    //@Column(name = "")
    private String departamento;
}
