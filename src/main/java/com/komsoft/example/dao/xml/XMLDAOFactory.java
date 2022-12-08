package com.komsoft.example.dao.xml;

import com.komsoft.example.dao.factory.DAOFactory;
import com.komsoft.example.dao.model.Customer;
import com.komsoft.example.dao.repository.CustomerDAO;

public class XMLDAOFactory extends DAOFactory {
    @Override
    public CustomerDAO getCustomerDAO() {
        return new XMLCustomerDAO();
    }
}
