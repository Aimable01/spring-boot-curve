package com.aimable01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Main {

    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // simple starting endpoints
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

    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    record NewCustomerRequest(String name, String email, Integer age) {}

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerRepository.deleteById(id);
    }
}
