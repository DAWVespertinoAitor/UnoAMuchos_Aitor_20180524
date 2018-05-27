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
            <h2>Insercción de datos</h2>
            <form method="post" action="control?op=add">
                <table style="margin: 0 auto;">
                    <tr>
                        <td colspan="2"><h3>Datos de País</h3></td>
                    </tr>
                    <tr>
                        <td>Nombre del País:</td>
                        <td><input type="text" name="nombre" /></td>
                    </tr>
                    <tr>
                        <td>Libro :</td>
                        <td><input type="text" name="titulo1"  /></td>
                    </tr>
                    <tr>
                        <td>Libro :</td>
                        <td><input type="text" name="titulo2"  /></td>
                    </tr>
                    <tr>
                        <td>Libro :</td>
                        <td><input type="text" name="titulo3"  /></td>
                    </tr>
                </table><br>
                <input type="submit" name="enviar" value="Enviar" class="boton" /><br><br>
            </form>
        </div>


    </body>
</html>