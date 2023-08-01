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
import java.util.Optional;

@WebServlet(urlPatterns = {"/book/*"})
public class BookController extends HttpServlet {
    private final BookDAO bookDAO = new BookDAO();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filePath = "/view/web/";
        Optional<String> pathInfo = Optional.ofNullable(request.getPathInfo());
        request.setCharacterEncoding("UTF-8");
        if (pathInfo.isPresent() && pathInfo.get().equals("/create")){
            filePath = filePath + "insertBook.jsp";
        } else {
            request.setAttribute("Book", bookDAO.getAll());
            filePath = filePath + "listBook.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(filePath);
        rd.forward(request,response);
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
