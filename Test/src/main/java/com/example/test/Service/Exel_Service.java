package com.example.test.Service;

import org.springframework.stereotype.Service;

@Service
public class Exel_Service extends Doc_Srevice
{


    public void process()
    {
        System.out.println("Processing Exel_Service");
    }
    public String print()
    {
        return "Ecel_Service";
    }
}
