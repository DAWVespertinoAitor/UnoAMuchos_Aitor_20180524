<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contexto" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
        <link rel="stylesheet" type="text/css" href="${contexto}/CSS/estilos.css" />
    </head>
    <body>
        <div class="columnasCentradas">
            <h2>Actualizaci&oacute;n de datos</h2>
            <form method="post" action="conclusion?op=update">
                <table style="margin: 0 auto;">
                    <tr>
                        <th colspan="2">Datos Persona</th>
                    </tr>
                    <tr>
                        <td>Código</td>
                    <input type="hidden" name="idPerso" value="${persona.idPerso}" readonly="readonly" />
                    <td><input type="text" value="${persona.idPerso}" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="nombre" value="${persona.nombre}" /></td>
                    </tr>
                    <c:forEach var="libros" items="${persona.libros}">
                        <tr>
                            <td>Libro : </td>
                            <input type="hidden" name="idLibro" value="${libros.idLibro}"/>
                            <td><input type="text" name="titulo" value="${libros.titulo}"/></td>
                        </tr>
                    </c:forEach>
                </table><br>
                <input type="submit" name="enviar" value="Enviar" class="boton"/><br><br>
            </form>
        </div>


    </body>
</html>