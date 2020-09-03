<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Success: </h1>
Name : ${userReg.name}<br/>
UserName : ${userReg.userName}<br/>
Password : ${userReg.password}<br/>
Country : ${userReg.country}<br/>
Hobbies : 
<c:forEach var="temp" items="${userReg.hobbies}">
 
 ${temp}

</c:forEach>
<br/>

Gender : ${userReg.gender}

<br/>

Email : ${userReg.communicationDTO.email}

<br/>

Phone : ${userReg.communicationDTO.phone}

</body>
</html>