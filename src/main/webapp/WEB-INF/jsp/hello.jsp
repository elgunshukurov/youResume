<%--
  Created by IntelliJ IDEA.
  User: Elgun PC
  Date: 11.02.2022
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Page!</title>
</head>
<body>
 <h2>Welcome ${name}</h2>
 <form method="post" action="hello.jsp">
     Menu:<br>
     <input type="submit" value="Show Employees" name="showAll"><br>
     <input type="submit" value="Show Employee By Id" name="showId"><br>
     <input type="submit" value="Add Employee" name="add"><br>
     <input type="submit" value="Update Employee" name="update"><br>
     <input type="submit" value="Delete Employee" name="delete"><br>
 </form>
</body>
</html>
