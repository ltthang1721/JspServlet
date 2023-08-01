<%@ page import="java.util.List" %>
<%@ page import="Model.Book" %>
<%@ page import="java.util.ArrayList" %>
<html>
<body>
<h2>List Book!</h2>

<table border ="1" width="500" align="center">
    <tr bgcolor="00FF7F">
        <th><b>Student Name</b></th>
        <th><b>Student Age</b></th>
        <th><b>Course Undertaken</b></th>
    </tr>
    <%
        ArrayList<Book> std =
            (ArrayList<Book>)request.getAttribute("Book");
        for(Book s:std){%>
    <tr>
        <td><%=s.getName()%></td>
        <td><%=s.getAuthorID()%></td>
        <td><%=s.getBookID()%></td>
    </tr>
    <%}%>
</table>


</body>
</html>
