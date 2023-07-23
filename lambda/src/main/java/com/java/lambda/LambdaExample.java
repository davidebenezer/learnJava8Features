package com.java.lambda;

interface Shape {
    void draw();
}

//class Rectangle implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("Rectangle");
//    }
//}
//
//class Square implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("Square");
//    }
//}
//
//class Circle implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("Circle");
//    }
//}

public class LambdaExample {
    public static void main(String args[]) {

        print(() -> System.out.println("Rectangle"));
        print(() -> System.out.println("Square"));
        print(() -> System.out.println("Circle"));
    }

    private static void print(Shape shape){
        shape.draw();
    }
}
