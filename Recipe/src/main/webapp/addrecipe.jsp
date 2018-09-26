<%-- 
    Document   : addrecipe
    Created on : 25-Sep-2018, 21:52:31
    Author     : Patrick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <header>
        <ul>
            <li><a class="active" href="addrecipe.jsp">Add Recipe</a></li>
            <li><a href="/Recipe/Controller?origin=getrecipes">All Recipes</a></li>
        </ul>
    </header>
    <body>
        <h1>Hello World, this is addrecipe!</h1>

        <form action="/Recipe/Controller">
            Recipe name:<br>
            <input type="text" name="recipename" value=""><br>
            Ingredients:<br>
            <input type="text" name="ingredients" value=""><br>
            Instructions:<br>
            <input type="text" name="ingredients" value=""><br>
            <input type="hidden" name="origin" value="addrecipe">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
