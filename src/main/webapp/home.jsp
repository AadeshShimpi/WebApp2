<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>KNOREX</title>
</head>
<body>

      <form action="addEmp">
           <h3>empid</h3><br>
           <input type="text" name="eid"><br>
           <h3>name</h3><br>
           <input type="text" name="ename"><br>
           <h3>technology</h3>
           <input type="text" name="tech"><br>
            <input type="submit"><br>
      </form>
      
      <form action="getEmp">
         
         <input type="text" name="eid"><br>
         <input type="submit"><br>
      
      </form>


</body>
</html>