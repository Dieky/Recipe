/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;

/**
 *
 * @author Patrick
 */
public class User
    {

    private List<Recipe> userRecipes;
    private int id;
    private String username, password;

    public User(int id, String username, String password)
      {
        this.id = id;
        this.username = username;
        this.password = password;
      }

    public int getId()
      {
        return id;
      }

    public void setId(int id)
      {
        this.id = id;
      }

    public String getUsername()
      {
        return username;
      }

    public void setUsername(String username)
      {
        this.username = username;
      }

    public String getPassword()
      {
        return password;
      }

    public void setPassword(String password)
      {
        this.password = password;
      }

    public List<Recipe> getUserRecipes()
      {
        return userRecipes;
      }

    public void setUserRecipes(List<Recipe> userRecipes)
      {
        this.userRecipes = userRecipes;
      }

    }
