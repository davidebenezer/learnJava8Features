package com.java.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String message);
    default void message(){
        System.out.println("def method");
    }

    static void smethod(){
        System.out.println("Static Method");
    }
}
