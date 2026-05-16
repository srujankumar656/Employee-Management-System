<%@ page language="java" import ="java.util.*, com.model.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
<marquee> Hi, <%= session.getAttribute("username")  %> Welcome Employees DashBoard </marquee>
<hr>

<a href="addEmployee.jsp">Add Employee</a>

<h2>Employees</h2>

<table border= "1">

    <tr>
    
       <th> Employee Id </th>
       <th> Employee Name </th>
       <th> Employee email </th>
       <th> Employee PhoneNum </th>
       <th> Employee salary </th>
       <th> Employee isActive </th>
       <td> Actions </td>
       
    </tr>
   
    
    <%  List<Employee> empsList = (List<Employee>) request.getAttribute("empList"); 
       
    for(Employee emp : empsList){
    
    
    %>
    <tr>
       <td> <%= emp.getEmpId() %> </td>
       <td> <%= emp.getName() %> </td>
       <td> <%= emp.getEmail() %> </td>
       <td> <%= emp.getPhoneNum() %> </td>
       <td> <%= emp.getSalary() %> </td>
       <td> <%= emp.isActive() %> </td>
       <td> <a href = "update?id=<%= emp.getEmpId() %>">Update Employee</a> <a href ="delete?id=<%= emp.getEmpId() %>" > Delete Employee</a> </td>
    </tr>
       
       <% } %>
</table>

</body>
</html>