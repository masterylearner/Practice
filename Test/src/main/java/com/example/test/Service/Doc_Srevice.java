package com.example.test.Service;

abstract public class Doc_Srevice implements Doc_Interface{
    @Override
    public void DB_hit() {
        System.out.println("DB hit");
    }

    public String callMethod() {
        DB_hit();
        process();
       return print();

    }

}
