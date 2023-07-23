package com.java.lambda;

interface Addable{
    int addition(int a, int b);
}

//class AddableImpl implements Addable{
//
//    @Override
//    public int addition(int a, int b) {
//        return (a+b);
//    }
//}
public class LambdaParameters {
    public static void main(String args[]) {
        Addable addable = (a, b) -> {
            int c = a + b;
            return c;
        };
        System.out.println(addable.addition(1,2));
    }
}
