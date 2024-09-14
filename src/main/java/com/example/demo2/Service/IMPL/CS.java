package com.example.demo2.Service.IMPL;

import com.example.demo2.DTO.IMPL.Customer;
import com.example.demo2.Service.CustomerService;
import com.example.demo2.Utill.AppUtill;

public class CS implements CustomerService {
    @Override
    public Customer saveCustomer(Customer customer) {
        customer.setCustomerID(AppUtill.generateCustomerId());
        return customer;
    }
}
