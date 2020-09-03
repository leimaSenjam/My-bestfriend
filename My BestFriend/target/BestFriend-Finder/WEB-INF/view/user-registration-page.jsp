<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Please register here:</h1>
<div align="center">
<form:form action="registration-success" method="GET" modelAttribute = "userReg">


<label> User : </label>
<form:input path = "name"/>
<br/>

<label> UserName :</label>
<form:input path= "userName"/>
<br/>

<label>Password:</label>
<form:password path="password"/>
<br/>

<label> Country : </label>
<form:select path = "country" >
<form:option value="Ind" label ="India"/>
<form:option value="USA" label = "United States"/>
<form:option value="KOR" label="Korea"/>
<form:option value="UN" label="United Kingdom"/>
</form:select>

<br/>
<label> Hobbies : </label>
Cricket <form:checkbox path="Hobbies" value= "cricket"/>
Reading <form:checkbox path="Hobbies" value="Reading"/>
Programming <form:checkbox path="Hobbies" value="Programming"/>
Travel <form:checkbox path="Hobbies" value="Travel"/>
<br/>
<label>Gender :</label>
Male<form:radiobutton path="Gender" value="male"/>
Female<form:radiobutton path="Gender" value="female"/>
<br/>
<input type="submit" value="register"/>
</form:form>
</div>
</body>
</html>





