package com.driver;

public class Main {

    static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B b = new B(); 
        A a = new B(); 
        System.out.println(a.meth()); 
        System.out.println(b.meth());
    }
}
