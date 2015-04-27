<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : listar
    Created on : 24-abr-2015, 13:47:31
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
        <p style="color: #ff0000">${error}</p>
        <c:forEach var="student" items="${students}">
            Nombre: ${student.name}
            <br/>
            RUT: ${student.rut}
            <br/>
            Edad: ${student.age}
            <br/>
            Editar
            <c:url value="edit" var="displayURL">
                <c:param name="var" value="${student.rut}" />
            </c:url>
            <c:url value="deleteStudent" var="displayURL2">
                <c:param name="var" value="${student.rut}" />
            </c:url>
            <a href='<c:out value="${displayURL}" />'>Editar</a>
            <a href='<c:out value="${displayURL2}" />'>Eliminar</a>
            <br/>
            <hr/>
        </c:forEach>
        <a href='<c:out value="index.jsp" />'>Volver</a>    
    </body>
</html>
