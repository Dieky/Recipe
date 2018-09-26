<%-- 
    Document   : recipe
    Created on : 25-Sep-2018, 11:43:09
    Author     : Patrick
--%>

<%@page import="Entity.Recipe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Show single recipe</title>
    </head>
    <header>
        <ul>
            <li><a href="addrecipe.jsp">Add Recipe</a></li>
            <li><a href="/Recipe/Controller?origin=getrecipes">All Recipes</a></li>
        </ul>
    </header>
    <body>

        <h1>An innovative recipe</h1>
        <% Recipe recipe = (Recipe) request.getAttribute("recipe"); %>
        <%  out.println("<Blockquote>" + "Opskrift: " + recipe.getName() + "</Blockquote>" + "<br>"); %>
        <%  out.println("<Blockquote>" + "Beskrivelse: " + recipe.getDescription() + "</Blockquote>" + "<br>"); %>
        <%  out.println("<Blockquote>" + "Fremgangsmetode: " + recipe.getTodo() + "</Blockquote>" + "<br>");%>

    </body>
</html>
