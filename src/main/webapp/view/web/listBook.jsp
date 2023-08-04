<%@ page import="java.util.List" %>
<%@ page import="Model.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<body>
<h2>List Book!</h2>

<table border ="1" width="1000" align="center">
    <tr bgcolor="00FF7F">
        <th><b>ID Sách</b></th>
        <th><b>Tên Sách</b></th>
        <th><b>Mã Thể Loại</b></th>
        <th><b>Mã Nhà Xuất Bản</b></th>
        <th><b>Mã Tác Giả</b></th>
        <th><b>Số Lượng</b></th>
        <th><b>Giá Tiền</b></th>
        <th><b>Hình</b></th>
        <th><b>Ưu Tiên</b></th>
        <th><b>Mã Danh Mục</b></th>
    </tr>
    <%
        ArrayList<Book> std =
            (ArrayList<Book>)request.getAttribute("Book");
        for(Book s:std){%>
    <tr>
        <td><%=s.getBookID()%></td>
        <td><%=s.getName()%></td>
        <td><%=s.getGenreID()%></td>
        <td><%=s.getPublisherID()%></td>
        <td><%=s.getAuthorID()%></td>
        <td><%=s.getQuantity()%></td>
        <td><%=s.getPrice()%></td>
        <td><%=s.getImages()%></td>
        <td><%=s.getPriority()%></td>
        <td><%=s.getCategoryID()%></td>

    </tr>
    <%}%>
</table>


</body>
</html>
