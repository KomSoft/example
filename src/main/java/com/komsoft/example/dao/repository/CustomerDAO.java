package com.komsoft.example.dao.repository;

import com.komsoft.example.dao.model.Customer;

public interface CustomerDAO {
    Customer findCustomerById(int id);
}
