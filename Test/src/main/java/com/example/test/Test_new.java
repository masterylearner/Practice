package com.example.test;

public class Test_new {
    public static void main(String[] args) {


    c obj2=new c();
    obj2.m1();
}}

class P{
    public static void m1(){
        System.out.println("parent");
    }
}

class c{
    public static void m1(){
        System.out.println("child");
    }
}