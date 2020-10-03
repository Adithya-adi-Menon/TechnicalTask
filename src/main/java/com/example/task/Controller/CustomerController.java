package com.example.task.Controller;

import com.example.task.Models.Customers;
import com.example.task.service.CustomerService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public ResponseEntity<List<Customers>> retriveCustomers()
    {
        return ResponseEntity.ok().body(customerService.retriveCustomers());
    }

    @PutMapping("/customers")
    public ResponseEntity<List<Customers>> addCustomer(@RequestBody List<Customers> customers)
    {
        return ResponseEntity.ok().body(this.customerService.addCustomer(customers));
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable long id)
    {
        return ResponseEntity.ok().body(this.customerService.getCustomerById(id));
    }
}
