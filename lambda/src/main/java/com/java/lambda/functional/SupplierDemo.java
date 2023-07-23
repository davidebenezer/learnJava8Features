package com.java.lambda.functional;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String args[]){
        Supplier<String> supplier = () -> String.valueOf(Math.random());
        System.out.println(supplier.get());
    }
}
