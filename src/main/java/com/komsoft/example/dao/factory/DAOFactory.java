package com.komsoft.example.dao.factory;

import com.komsoft.example.dao.postgresql.PostgreSQLDAOFactory;
import com.komsoft.example.dao.repository.CustomerDAO;
import com.komsoft.example.dao.xml.XMLDAOFactory;

public abstract class DAOFactory {
    public abstract CustomerDAO getCustomerDAO();
    public  static final int POSTGRESQL = 1;
    public  static final int XML = 2;

    public static DAOFactory getInstance(int whichFactory) {
        switch (whichFactory) {
            case POSTGRESQL : return new PostgreSQLDAOFactory();
            case XML: return new XMLDAOFactory();
            default: return null;
        }
    }
}
