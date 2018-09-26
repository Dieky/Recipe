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
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <li><a class="active" href="default.asp">Home</a></li>
            <li><a href="news.asp">News</a></li>
            <li><a href="contact.asp">Contact</a></li>
            <li><a href="about.asp">About</a></li>
        </ul>
        <h1>Hello World!</h1>
        <div id="showallrecipes">
            <% List<Recipe> recipes = (List) session.getAttribute("recipes");%>
            <%
                out.print(Collection2Html.recipeList2HtmlLink(recipes));
            %>
        </div>

    </body>
</html>
