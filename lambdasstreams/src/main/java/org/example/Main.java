package org.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;


public class Main {
    public static void main(String[] args) {
        Greetings grtobj = new HelloGreeting();
        grtobj.sayHello();

        Greetings grtobj2 = new Greetings() {
            @Override
            public void sayHello()
            {
                System.out.println("Say Hello");
            }
        };
        grtobj2.sayHello();
        Greetings grtobj3 = () -> System.out.println("Greeting from 3rd Object as Lamda");
        grtobj3.sayHello();

        IntBinaryOperator calulate = (int x, int y) -> {
            Random rand = new Random();
            int randNumber = rand.nextInt(50);
            return x * y + randNumber;
        };
        System.out.println(calulate.applyAsInt( 1, 2));
        Answer.Employee employee = new Answer.Employee("Jerome", "Donaldson");
        String result = Answer.getFullName(employee);
        System.out.println(result);

        Country county = new Country();
        county.OrderInt();
        county.ShopList();


    }


}