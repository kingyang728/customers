package com.vdespa.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomersController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping
    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomerById(@PathVariable("id") long id) {
        return repository.findById(id);
    }
}
