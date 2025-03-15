<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="form"
uri="http://java.sun.com/jstl/core" prefix="c" %> 
    
      <%@ taglib prefix="form"
uri="http://java.sun.com/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
         <h1>user data submitted with validations</h1>
         
           FirstName : ${user.firstName}<br><br>
           LastName : ${user.lastName}<br><br>
           Gender : ${user.gender}<br><br>
           Food:
           <ul>
           <c:forEach var="food" items="${user.food}">
                 <li>${food}</li>
           </c:forEach>
          </ul>
          <br><br>
           Leaving from : ${user.cityFrom }<br><br>
           Going to : ${user.cityTo }<br><br>
           Journey date :${user.jDate }<br><br>
            Seat No:
             <ul>
           <c:forEach var="seat" items="${user.seat}">
                 <li>${seat}</li>
           </c:forEach>
           </ul>
           <br><br>
           
           <a href="userform">click here to register</a>

</body>
</html>