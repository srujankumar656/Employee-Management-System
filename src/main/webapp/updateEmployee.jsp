<%@ page language="java" import = "com.model.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Update Employee</h2>

<% Employee emp = (Employee) request.getAttribute("emp"); %>

<form action="update" method = "post">

        <label for = "empId">Employee Id : </label>
        <input type = "hidden" name = "empId" placeholder = "Enter Name" value = "<%= emp.getEmpId() %>"> <br><br>
        

        <label for = "name">Name : </label>
        <input type = "text" name = "name" placeholder = "Enter Name" value = "<%= emp.getName() %>"><br><br>
        
        <label for = "email">Email : </label>
        <input type = "email" name = "email" placeholder = "Enter mail" value = "<%= emp.getEmail() %>"><br><br>
        
        <label for = "phoneNum">PhoneNum : </label>
        <input type = "text" name = "phoneNum" placeholder = "Enter phoneNum" value = "<%= emp.getPhoneNum() %>"><br><br>
        
        <label for = "salary">Salary : </label>
        <input type = "number" name = "salary" placeholder = "Enter salry" value = "<%= emp.getSalary() %>"><br><br>
        
        <label for = "isActive">isActive : </label>
        <input type = "text" name = "isActive" placeholder = "Enter isActive" value = "<%= emp.isActive() %>"><br>

        <input type = "submit" value = "Update Employee">
</form>

</body>
</html>