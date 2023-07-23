package com.java.lambda;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Run Method Called.");
    }
}
public class RunnableJavaExample {
    public static void main(String args[]){
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

//        Runnable runnable = () -> {
//            System.out.println("Run using lambda");
//        };

        Thread thread1 = new Thread(() -> {
            System.out.println("Run using lambda");
        });
        thread1.start();

    }
}
