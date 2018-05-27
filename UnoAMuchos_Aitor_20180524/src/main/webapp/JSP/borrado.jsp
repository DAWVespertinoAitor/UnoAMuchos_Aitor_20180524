<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrado</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilos.css" />
    </head>
    <body>

        <div class="columnasCentradas">
            <h2>Elige uno para eliminar</h2>



            <form method="post" action="control?op=delete">
                <table style="margin: 0 auto;">
                    <c:forEach var="item" items="${listadoPersona}">
                        <tr>
                            <td><input type="radio" name="registro" value="${item.idPerso}" /></td>
                            <td>
                                <b>
                                    <c:out value="${item.nombre}"/>
                                </b>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <c:forEach var="libro" items="${item.libros}">
                                    <c:out value="${libro.titulo}"/> |
                                </c:forEach>
                            </td>
                        </tr>
                    </c:forEach>
                </table><br>
                <input type="submit" value="Eliminar" class="boton"/><br><br>
            </form>

        </div>


    </body>
</html>