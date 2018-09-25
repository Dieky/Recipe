/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DBConnector.getConnection;
import Entity.Ingredient;
import Entity.Recipe;
import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick
 */
public class DataMapper
    {

    public User getUser(String username, String password)
      {
        User user = null;
        try
          {
            String sql = "SELECT * FROM Recipe.User WHERE username = ? AND password = ?";
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            while (rs.next())
              {
                int ID = rs.getInt("id");
                String USERNAME = rs.getString("username");
                String PASSWORD = rs.getString("password");
                user = new User(ID, USERNAME, PASSWORD);
              }
          } catch (SQLException ex)
          {
            ex.printStackTrace();
          }
        return user;
      }

    public void createUser(String username, String password)
      {
        try
          {
            String sql = "INSERT INTO Recipe.User (username, password) VALUES (?, ?)";
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            pstm.executeUpdate();

          } catch (SQLException ex)
          {
            ex.printStackTrace();
          }
      }

    public Recipe getRecipeByName(String name)
      {
        Recipe recipe = null;
        try
          {
            String sql = "SELECT * FROM Recipe.Recipe WHERE recipe = ?";
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next())
              {
                int ID = rs.getInt("id");
                String NAME = rs.getString("recipe");
                String DESCRIPTION = rs.getString("description");
                String TODO = rs.getString("todo");
                int COOKINGTIME = rs.getInt("cookingtime");
                recipe = new Recipe(ID, COOKINGTIME, NAME, DESCRIPTION, TODO);
              }

          } catch (SQLException ex)
          {
            ex.printStackTrace();
          }
        return recipe;
      }

    public List<Recipe> getAllRecipes()
      {
        List<Recipe> recipes = new ArrayList<>();
        try
          {
            String sql = "SELECT id, recipe, description, todo, cookingtime FROM Recipe.Recipe;";
            Connection con = getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next())
              {
                int ID = rs.getInt("id");
                String NAME = rs.getString("recipe");
                String DESCRIPTION = rs.getString("description");
                String TODO = rs.getString("todo");
                int COOKINGTIME = rs.getInt("cookingtime");
                Recipe recipe = new Recipe(ID, COOKINGTIME, NAME, DESCRIPTION, TODO);
                recipes.add(recipe);
              }

          } catch (SQLException ex)
          {
            ex.printStackTrace();
          }
        return recipes;
      }

    }
