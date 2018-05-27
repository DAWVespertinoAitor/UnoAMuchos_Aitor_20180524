<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilos.css" />
    </head>
    <body>

        <div class="rellenarForm">
            <h2>Listado de Personas</h2>

            <table style="margin: 0 auto;">
                <c:forEach var="item" items="${listadoPersona}">


                    
                    <tr>
                        <td>
                            <c:out value="${item.nombre}"/>
                        </td>
                        <td>

                        </td>
                    </tr>
                    <tr>
                        <td>
                        </td>
                        <c:forEach var="libro" items="${item.libros}">
                            <td><c:out value="${libro.titulo}"/> | </td>
                        </c:forEach>
                    </tr>

                </c:forEach>
            </table>
            <br />
            <p><a href="${contexto}/" class="enlace">Men&uacute; inicial</a></p>
        </div>


    </body>
</html>