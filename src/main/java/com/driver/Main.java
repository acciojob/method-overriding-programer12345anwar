package com.driver;

class A{
    public String meth(){ 
        return "Invoking method from class A"; 
    }//abstact method must be inside abstract class
}

class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());
    }
  
}