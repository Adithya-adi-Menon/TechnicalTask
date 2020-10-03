package com.example.task.service;

import com.example.task.Exceptions.ResourceNotFound;
import com.example.task.Models.Customers;
import com.example.task.respository.Customer_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class CustomerImplement implements CustomerService{
    @Autowired
    private Customer_repo customer_repo;

    @Override
    public List<Customers> addCustomer(List<Customers> customers) {
        return (List<Customers>) customer_repo.saveAll(customers);
    }

    @Override
    public List<Customers> retriveCustomers() {
        return (List<Customers>) this.customer_repo.findAll();
    }

    @Override
    public Customers getCustomerById(long customerId) {
        Optional<Customers> customersDb = this.customer_repo.findById(customerId);

        if(customersDb.isPresent()){
            return customersDb.get();
        }
        else{
            throw new ResourceNotFound("Record Not Found With id : " + customerId);
        }
    }
}
