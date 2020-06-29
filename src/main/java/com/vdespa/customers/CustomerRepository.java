package com.vdespa.customers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerRepository {


    private List<Customer> customers;

    public CustomerRepository() {
        customers = new ArrayList<>();

        customers.add(new Customer(
                1,
                "John",
                "Doe",
                "",
                "male"
        ));

        customers.add(new Customer(
                2,
                "Mary",
                "Walters",
                "Prof. Dr.",
                "female"
        ));

        customers.add(new Customer(
                3,
                "Ava-Grace",
                "Davis",
                "",
                "female"
        ));

        customers.add(new Customer(
                4,
                "Kiaan",
                "Shepard",
                "",
                "male"
        ));

        customers.add(new Customer(
                5,
                "Jaydon",
                "Downs",
                "Dr.",
                "female"
        ));
    }

    public List<Customer> findAll() {
        return customers;
    }

    public Customer findById(float id) {
        return customers.stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);
    }
}
