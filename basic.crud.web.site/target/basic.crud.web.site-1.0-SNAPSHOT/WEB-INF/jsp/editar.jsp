<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : editar
    Created on : 26-abr-2015, 20:01:54
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
        <h1>Editar</h1>
        
        <form method="post" action="edit">
            Name:
            <input type="text" name="name" value="${student.name}" />
            <br /><br />
            RUT:
            <input type="text" name="rut" value="${student.rut}" />
            <br /><br />
            Edad:
            <input type="text" name="age" value="${student.age}" />
            <input type="hidden" name="rutOld" value="${student.rut}" />
            <br /><br />
            <input type="submit" value="Enviar" />
            <br /><br />
        </form>
        <a href='<c:out value="index.jsp" />'>Volver</a>
    </body>
</html>
