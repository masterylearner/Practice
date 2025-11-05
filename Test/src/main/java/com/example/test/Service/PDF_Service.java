package com.example.test.Service;

import org.springframework.stereotype.Service;

@Service
public class PDF_Service extends  Doc_Srevice{


    @Override
    public void process() {
        System.out.println("process");

    }

    @Override
    public String print() {
        return "PDF_Service";
    }
}
