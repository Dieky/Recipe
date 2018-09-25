<%-- 
    Document   : recipes
    Created on : 25-Sep-2018, 13:36:39
    Author     : Patrick
--%>

<%@page import="Presentation.Collection2Html"%>
<%@page import="java.util.List"%>
<%@page import="Entity.Recipe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% List<Recipe> recipes = (List) session.getAttribute("recipes"); %>
        <%
           out.print(Collection2Html.recipeList2HtmlLink(recipes));
            %>
           
        
    </body>
</html>
