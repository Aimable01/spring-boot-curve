package com.aimable01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//
//    @GetMapping("/")
//    public GreetResponse greet(){
//        return new GreetResponse(
//                "Hello",
//                List.of("Java","Golang","Javascript"),
//                new Person("Alex",23,43_000)
//        );
//    }
//
//    record Person(String name, int age, double savings){}
//
//    record GreetResponse(
//        String greet,
//        List<String> favProgrammingLanguages,
//        Person person
//    ){}
//
//    // to practice usage of records
//    record Car(String name, int kilos){}
//    record StartCar(boolean on,Car car){}
//
//    @GetMapping("/car")
//    public StartCar startCar(){
//        return new StartCar(
//                true,new Car("Maserati",45_000)
//        );
//    }
}
