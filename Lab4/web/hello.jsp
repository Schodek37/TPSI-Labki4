<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
       
       <h1>Cześć, <c:out value="${person1.firstName} ${person1.lastName}"/>!</h1>
       <%-- tutaj tekst interpretowany jest jako tekst a nie jak fragment kodu (html)--%>
       <h1>Cześć, ${person1.firstName} ${person1.lastName}!</h1>
       <h2>Mail to : <a href="mailto:${person1.email}">${person1.email}</a></h2>
        <%--  Analizuje kod i wykonuje to co zawiera tzn.: jeżeli uwzględniamy kolor napisu to go zmieni, bądź jeżeli wkleimy tam skrypt to zostanie wykonany  --%>
   
    
       <c:forEach items="${dniTygodnia}" var="dzien">
            <p>
                ${dzien}
            </p>
       </c:forEach>

    
    </body>
</html>