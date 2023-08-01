package Controller;

import DAO.BookDAO;
import DTO.BookDTO;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/listSach/*","/insertBook"})
public class BookController extends HttpServlet {
    private BookDAO bookDAO = new BookDAO();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        request.setCharacterEncoding("UTF-8");
        if(pathInfo == null){
            request.setAttribute("Book", bookDAO.getAll());
            RequestDispatcher rd = request.getRequestDispatcher("/view/web/listSach.jsp");
            rd.forward(request,response);
        }
        else {
            RequestDispatcher rd = request.getRequestDispatcher("/view/web/insertBook.jsp");
            rd.forward(request,response);
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String matl = request.getParameter("matl");
        String manxb = request.getParameter("manxb");
        String matg = request.getParameter("matg");
        int sl = Integer.parseInt(request.getParameter("sl"));
        float giatien = Float.parseFloat(request.getParameter("giatien"));
        String hinh = request.getParameter("hinh");
        int uutien = Integer.parseInt(request.getParameter("uutien"));
        String madm = request.getParameter("madm");

        bookDAO.insert(new BookDTO(name,matl,manxb,matg,sl,giatien,hinh,uutien,madm));

        if(name.isEmpty()){
            RequestDispatcher req = request.getRequestDispatcher("view/web/insertBook.jsp");
            req.include(request, response);
        }
        else {
            RequestDispatcher req = request.getRequestDispatcher("view/web/insert_successfully.jsp");
            req.forward(request, response);
        }

    }
}
