package com.example.demo2.Entity.IMPL;

import com.example.demo2.Entity.SuperEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CustomerEntity implements SuperEntity {
    @Id
    public String customerID;
    public String customerName;
    public String cusomerAddress;
    public String customerEmail;
    public String customerMobileNUmber;
}
