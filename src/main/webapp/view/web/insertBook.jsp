<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 01/08/2023
  Time: 4:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>List Books</h1>
<form action="/book" method="post">
  <table style="with: 20%">
    <tr>
      <td>Name</td>
      <td><input type="text" name="name" /></td>
    </tr>
    <tr>
      <td>GenreID</td>
      <td><input type="text" name="genreID" /></td>
    </tr>
    <tr>
      <td>PublisherID</td>
      <td><input type="text" name="publisherID" /></td>
    </tr>
    <tr>
      <td>AuthorID</td>
      <td><input type="text" name="authorID" /></td>
    </tr>
    <tr>
      <td>Quantity</td>
      <td><input type="text" name="quantity" /></td>
    </tr>
    <tr>
      <td>Price</td>
      <td><input type="text" name="price" /></td>
    </tr>
    <tr>
      <td>Image</td>
      <td><input type="text" name="images" /></td>
    </tr><tr>
    <td>Priority</td>
    <td><input type="text" name="priority" /></td>
  </tr>
    <tr>
      <td>CategoryID</td>
      <td><input type="text" name="categoryID" /></td>
    </tr>
  </table>
  <input type="submit" value="Submit" /></form>

</body>
</html>
