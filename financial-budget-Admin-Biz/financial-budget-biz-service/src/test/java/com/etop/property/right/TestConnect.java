package com.etop.property.right;

import java.sql.*;

public class TestConnect {
    public static void main(String[] args) {
        Connection con;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/gzw_financial_budget?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "1234";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            String sql = "select * from enterprise_base_info";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                String job = rs.getString("chief_accountant");
                String id = rs.getString("company_name");

                System.out.println(id + "\t" + job);
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
