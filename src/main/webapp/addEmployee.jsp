<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Add Employee</h2>

<form action="addEmployee" method = "post">
        <label for = "name">Name : </label>
        <input type = "text" name = "name" placeholder = "Enter Name">
        
        <label for = "email">Email : </label>
        <input type = "email" name = "email" placeholder = "Enter mail">
        
        <label for = "phoneNum">PhoneNum : </label>
        <input type = "text" name = "phoneNum" placeholder = "Enter phoneNum">
        
        <label for = "salary">Salary : </label>
        <input type = "number" name = "salary" placeholder = "Enter salry">

        <input type = "submit" value = "Add Employee">
</form>

</body>
</html>