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
        <title>JSP Page</title>
    </head>
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
