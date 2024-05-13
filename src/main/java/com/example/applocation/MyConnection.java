package com.example.applocation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getMyConnection() throws SQLException, SQLException {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3308/fptaptech2";
        con = DriverManager.getConnection(url, "root", "");
        return con;
    }
}
