package com.example.test.Factory;

import com.example.test.Service.Doc_Interface;
import com.example.test.Service.Exel_Service;
import com.example.test.Service.PDF_Service;
import org.springframework.stereotype.Service;

@Service
public class Doc_Factory {

    Doc_Interface obj;

    public static Doc_Interface Doc_Fact(String opt){
        if(opt.equals("PDF")){
            return new PDF_Service();
        }

        if(opt.equals("Exel")){
            return new Exel_Service();
        }
        return null;
    }

}
