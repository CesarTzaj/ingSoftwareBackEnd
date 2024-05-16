package com.crm.clienteservice.mapper;

import com.crm.clienteservice.dto.CustomerDTO;
import com.crm.clienteservice.entity.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDTO toCustomerDto(Customer customer);
    List<CustomerDTO> toCustomerDtos(List<Customer> customers);

    @InheritInverseConfiguration
    Customer toCustomer(CustomerDTO customerDTO);

}
