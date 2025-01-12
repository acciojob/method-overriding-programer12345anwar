package com.driver;

// Task 1: Create class A
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B extending A
class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B
        B b = new B();

        // Call method meth from class A using object of B
        A a = new B(); // Polymorphism
        System.out.println(a.meth()); // Calls overridden method in B

        // Task 4 & 5: Call the overridden method from object of class B
        System.out.println(b.meth());
    }
}
