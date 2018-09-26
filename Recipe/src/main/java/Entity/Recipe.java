/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Comparator;

/**
 *
 * @author Patrick
 */
public class Recipe implements Comparable<Recipe>
    {

    private int id, cookingtime;
    private String name, description, todo;

    public Recipe(int id, int cookingtime, String name, String description, String todo)
      {
        this.id = id;
        this.cookingtime = cookingtime;
        this.name = name;
        this.description = description;
        this.todo = todo;
      }

    public int getId()
      {
        return id;
      }

    public void setId(int id)
      {
        this.id = id;
      }

    public int getCookingtime()
      {
        return cookingtime;
      }

    public void setCookingtime(int cookingtime)
      {
        this.cookingtime = cookingtime;
      }

    public String getName()
      {
        return name;
      }

    public void setName(String name)
      {
        this.name = name;
      }

    public String getDescription()
      {
        return description;
      }

    public void setDescription(String description)
      {
        this.description = description;
      }

    public String getTodo()
      {
        return todo;
      }

    public void setTodo(String todo)
      {
        this.todo = todo;
      }

    @Override
    public int compareTo(Recipe o)
      {
        return this.getName().compareTo(o.getName());
      }



    }
