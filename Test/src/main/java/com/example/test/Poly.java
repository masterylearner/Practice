package com.example.test;

public class Poly {
    public static void main(String[] args) {

    Child child = new Child();
    child.m2(1,2);
}
}


class Parent {

   public void m1(int a,int b){
    System.out.println("parent m1_ with 2 int ver");
    }

   public void m2(int a,int b){
        System.out.println("parent m2_ with 2 int ver");
    }
    public void m2(int b){
        System.out.println("parent m1_ with 1 int ver");
    }


}
class Child extends Parent {

   public void m2(int a,int b){
        System.out.println("childe m1_ with 1 int ver");
    }
}
