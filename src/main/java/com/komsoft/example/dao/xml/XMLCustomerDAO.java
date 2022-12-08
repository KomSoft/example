package com.komsoft.example.dao.xml;


import com.komsoft.example.dao.model.Customer;
import com.komsoft.example.dao.repository.CustomerDAO;

public class XMLCustomerDAO implements CustomerDAO {

    public XMLCustomerDAO() {
    }

    @Override
    public Customer findCustomerById(int id) {
        Customer customer = new Customer();
        customer.setName("XML_Customer");
        customer.setRegion("XML_Region");
        return customer;
    }


}
