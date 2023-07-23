package com.java.lambda.functional;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String args[]){
        Consumer<String> consume = (T) ->
                System.out.println(T);
        consume.accept("Hello");
    }
}
