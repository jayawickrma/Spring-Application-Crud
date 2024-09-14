package com.example.demo2.DTO.IMPL;

import com.example.demo2.DTO.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements SuperDTO {
    public String customerID;
    public String customerName;
    public String cusomerAddress;
    public String customerEmail;
    public String customerMobileNUmber;

}
