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
public class StudentEntity implements SuperEntity {
    @Id
    public String name;
    public String address;
    public String age;
    public String School;
}
