package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application1 {

    public static void main(String[] args) {

        Connection con = null;

        /**/
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            /* DriverManager 이용해 Connection생성 */
            con = DriverManager.getConnection("jdbc:mysql://localhost/employeedb","ohgiraffers","ohgiraffers");

            System.out.println("con = " + con);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
