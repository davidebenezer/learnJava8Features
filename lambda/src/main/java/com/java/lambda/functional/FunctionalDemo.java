package com.java.lambda.functional;

import java.util.function.Function;

public class FunctionalDemo {
    public static void main(String args[]){
        Function<String, Integer> functional =
                (t) -> t.length();
        System.out.println(functional.apply("hello"));
    }
}
