package com.example.demo2.Utill;

import java.util.UUID;

public class AppUtill {
    public static String generateCustomerId(){
        return "Customer ID - " +UUID.randomUUID();
    }
}
