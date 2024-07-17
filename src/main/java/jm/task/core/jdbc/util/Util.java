package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String userName = "root";
    private static final String password = "admin";
    private static final String connectionUrl = "jdbc:mysql://localhost:3306/test";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl, userName, password);
    }
}