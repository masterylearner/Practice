package com.example.test.Controller;

import com.example.test.Factory.Doc_Factory;
import com.example.test.Service.Doc_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_1 {

    @Autowired
    Doc_Factory obj;

    @GetMapping("doc/{DocType}")
    public String getDoc(@PathVariable String DocType){
      Doc_Interface obj=new Doc_Factory().Doc_Fact(DocType);
        if(obj==null)return "wrong input";
      return obj.callMethod();
    }
}
