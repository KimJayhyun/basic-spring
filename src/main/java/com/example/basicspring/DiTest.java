package com.example.basicspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.basicspring");

        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello.sayHello());

        Printer printer = context.getBean("stringPrinter", Printer.class);
        System.out.println(printer.toString());
    }
}
