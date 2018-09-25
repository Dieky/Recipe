/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.Recipe;
import java.util.List;

/**
 *
 * @author Patrick
 */
public class Collection2Html
    {

    public static String recipeList2HtmlLink(List<Recipe> recipes)
      {
        String out = "";
        for (Recipe recipe : recipes)
          {
            out += " <a href=Controller?origin=showrecipe&recipe="+recipe.getName()+">"+recipe.getName()+"</a><br>";
          }
        return out;
      }

    }
