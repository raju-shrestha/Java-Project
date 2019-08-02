<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 03/04/2018
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Table</title>
</head>
<body>
<form action ="book?action=addNew" method="post">
    Book Name<input type="text" name="bookname"><br>
    Author <input type="text" name="author"><br>
    Category<input type=text" name="category"><br>
    ISBN<input type="text" name="isbn"><br>
    Price<input type="text" name="price" ><br>
    Purchase Date<input type="text"  name="purchased_date"><br>
    <input type="button" name="Submit">
</form>

</body>
</html>
