package com.komsoft.example.dao.postgresql;

import com.komsoft.example.dao.factory.DAOFactory;
import com.komsoft.example.dao.repository.CustomerDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLDAOFactory extends DAOFactory {
    private Connection connection = null;

    @Override
    public CustomerDAO getCustomerDAO() {
        return new PostgreSQLCustomerDAO(this);
    }

    public void establishConnection() {
        final String url = "jdbc:postgresql://localhost:5432/testDB";
        final String user = "postgres";
        final String password = "psql";
        if (this.connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                this.connection = DriverManager.getConnection(url, user, password);
//            return this.connection;
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
