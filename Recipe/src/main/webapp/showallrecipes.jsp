<%-- 
    Document   : recipes
    Created on : 25-Sep-2018, 13:36:39
    Author     : Patrick
--%>

<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="Presentation.Collection2Html"%>
<%@page import="java.util.List"%>
<%@page import="Entity.Recipe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>All recipes</title>
    </head>
    <header>
        
        <ul>
            <li><a href="addrecipe.jsp">Add Recipe</a></li>
            <li><a class="active" href="/Recipe/Controller?origin=getrecipes">All Recipes</a></li>
        </ul>
    </header>
    <body>
        <h1>List of all recipes</h1>
        <div id="showallrecipes">
            <% List<Recipe> recipes = (List) session.getAttribute("recipes");
                Collections.sort(recipes);
            %>
            <%
                out.print(Collection2Html.recipeList2HtmlLink(recipes));
            %>
        </div>

    </body>
</html>
