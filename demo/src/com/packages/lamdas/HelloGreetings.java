package com.packages.lamdas;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class HelloGreetings implements Greetings {
    @Override
    public void sayHello() {
        System.out.println("Helloooo");
    }

    public static void main(String[] args) {
        Greetings greetings = new HelloGreetings();
        greetings.sayHello();

        Greetings greetings1 = new Greetings(){
            @Override
            public void sayHello(){
                System.out.println("Hello from greetng1");
            }
        };
        greetings1.sayHello();

//        Parameterless lambda
        Greetings greetings2 = ()-> System.out.println("Hello from greeting2");
        greetings2.sayHello();

//        Parameterize lambda
        Calculator calculator = (x,  y)->{
            Random random = new Random();
            return  x*y + random.nextInt(50);

        };

        System.out.println( calculator.calculate(1,2));

//        Already existing interfaces from java.util.function
        IntBinaryOperator intBinaryOperator = (x, y) ->{
            Random random = new Random();
            System.out.println("from binary operator method is called");
            return x * y+ random.nextInt(50);
        };
        System.out.println(intBinaryOperator.applyAsInt(1,2));
    }
}
