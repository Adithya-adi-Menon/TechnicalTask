package com.example.task.respository;

import com.example.task.Models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Customer_repo extends CrudRepository<Customers , Long>{

}
