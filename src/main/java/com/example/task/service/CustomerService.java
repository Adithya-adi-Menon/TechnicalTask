package com.example.task.service;

import com.example.task.Models.Customers;

import java.util.List;

public interface CustomerService {

    List <Customers> addCustomer(List<Customers> customers);

    List<Customers> retriveCustomers();
    Customers getCustomerById(long customerId);



}
