package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException

    {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        Connection con=null;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learning", "root", "admin");
        System.out.println(con);

        //Create a Satetement
        Statement st = con.createStatement();

        //Create ResultSet

        ResultSet rs = st.executeQuery("select * from CustomerInfo;");
  
        while (rs.next())
        {
            System.out.print(rs.getString(1)+"   ");
            System.out.print (rs.getString(2)+"   ");
            System.out.print(rs.getInt(3)+"   ");
            System.out.println(rs.getString(4));
        }


    }
}
