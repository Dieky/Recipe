/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnector
    {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://46.101.250.246:3306/Recipe";
    private static final String USER = "master";
    private static final String PASSWORD = "master";
    private static Connection conn = null;

    public static Connection getConnection()
      {
        if (conn == null)
          {
            try
              {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
              } catch (ClassNotFoundException ex)
              {
                ex.printStackTrace();
              } catch (SQLException ex)
              {
                //se hele sekvenst til det gik galt. Dette kan skrives til logfil.
                ex.printStackTrace();
              }
          }
        return conn;
      }

    public static void main(String[] args)
      {
        //Test connection
        try
          {
            String sql = "SELECT * FROM Recipe.User;";
            ResultSet rs = getConnection().prepareStatement(sql).executeQuery();
            while (rs.next())
              {
                  System.out.println(rs.getString("username"));
              }
          } catch (SQLException ex)
          {
            ex.printStackTrace();
          }
      }
    }
