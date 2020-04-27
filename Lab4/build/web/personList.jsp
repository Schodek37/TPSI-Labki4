<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        czemu nie działa???<br>
        już działa <br>
        
        <table border="1">
                <c:forEach items="${listaosob}" var="osoba">
                    <tr>  

                        <td> ${osoba.firstName}</td>
                        <td> ${osoba.lastName}</td>
                        <td> ${osoba.email}</td>

                    </tr>
                </c:forEach>
      </table>
        

    </body>
</html>
