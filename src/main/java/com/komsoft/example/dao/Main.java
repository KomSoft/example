package com.komsoft.example.dao;

import com.komsoft.example.dao.factory.DAOFactory;
import com.komsoft.example.dao.repository.CustomerDAO;

public class Main {

    public static void main(String[] args) {
        DAOFactory factory = DAOFactory.getInstance(DAOFactory.XML);
        CustomerDAO repository = factory.getCustomerDAO();
        System.out.println(repository.findCustomerById(3));
    }
}
