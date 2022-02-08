package com.aadimcollege.db;

import java.sql.*;

/**
 *
 * @author yubaraj
 */
public class DatabaseConnection {

    public static Connection getConnection() {
        String url;
        String con;
        try {
            url = "jdbc:mysql://localhost:3306/bootcamp_2022";
            con = "com.mysql.jdbc.Driver";
            Class.forName(con);
            Connection cn = DriverManager.getConnection(url, "root", "");
            System.out.println("Connected !");
            return cn;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
