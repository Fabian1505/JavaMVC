<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : 26-abr-2015, 18:58:36
    Author     : ZedGe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ul>
            <li><a href="<c:url value="Listar"/>">Listar</a></li>
            <li><a href="<c:url value="Agregar"/>">Agregar</a></li>
        </ul>
    </body>
</html>
