package com.example.demo2.Controller;

import com.example.demo2.DTO.IMPL.Customer;
import com.example.demo2.Utill.AppUtill;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/customer")
public class CustomerController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer saveCustomer(Customer customerDto){
        customerDto.setCustomerID(AppUtill.generateCustomerId());
    }
}
