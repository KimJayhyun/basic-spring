package com.example.basicspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.basicspring.ConsolePrinter;
import com.example.basicspring.Hello;
import com.example.basicspring.StringPrinter;

@Configuration
public class bean {

    // @Bean
    // public Hello hello() {
    //     return new Hello();
    // }

    @Bean
    public Hello hello(StringPrinter stringPrinter) {
        Hello hello = new Hello();
        hello.setName("Name Test");
        hello.setPrinter(stringPrinter);
        return hello;
    }


    @Bean
    public StringPrinter stringPrinter() {
        return new StringPrinter();
    }

    @Bean
    public ConsolePrinter consolePrinter() {
        return new ConsolePrinter();
    }


}
