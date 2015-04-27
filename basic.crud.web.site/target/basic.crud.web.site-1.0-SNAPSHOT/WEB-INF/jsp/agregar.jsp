<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- 
    Document   : agregar
    Created on : 26-abr-2015, 19:04:11
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
        <fmt:setBundle basename="com.basic.crud.web.site.properties.messages" var="lang"/>
        <fmt:message key="AGREGAR" bundle="${lang}"/><br/>
        <h1></h1>
        <form method="post" action="Agregar">
            Name:
            <input type="text" size="20" id="name" name="name"/>
            Rut
            <input type="text" size="20" id="rut" name="rut"/>
            Age:
            <input type="text" size="20" id="age" name="age"/>
            <input type="submit" value="Enviar" />
        </form>
        <a href='<c:out value="index.jsp" />'>Volver</a>
    </body>
</html>
