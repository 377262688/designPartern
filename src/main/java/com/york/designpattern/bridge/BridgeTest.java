package com.york.designpattern.bridge;

import java.sql.*;

/**
 * @author york
 * @create 2020-06-18 11:58
 **/
public class BridgeTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/ziliao?user=root&password=yorkroot";
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        String query = "select * from t_xiama_write";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(3));
        }
    }
}
