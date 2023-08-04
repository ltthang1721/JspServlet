package Controller;

import DAO.BookDAO;
import DTO.BookDTO;
import Service.BookService;

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
        String genreID = request.getParameter("genreID");
        String publisherID = request.getParameter("publisherID");
        String authorID = request.getParameter("authorID");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        float price = Float.parseFloat(request.getParameter("price"));
        String images = request.getParameter("images");
        int priority = Integer.parseInt(request.getParameter("priority"));
        String categoryID = request.getParameter("categoryID");
        BookService bookService = new BookService();

        bookDAO.insert(new BookDTO(name,genreID,publisherID,authorID,quantity,price,images,priority,categoryID));

        if(name.isEmpty()){
            RequestDispatcher req = request.getRequestDispatcher("view/web/insertBook.jsp");
            req.include(request, response);
        } else if (bookService.isNameExist(name)) {
            request.setAttribute("Book", name);
            RequestDispatcher req = request.getRequestDispatcher("view/web/error.jsp");
            req.forward(request, response);
        } else {
            RequestDispatcher req = request.getRequestDispatcher("view/web/insert_successfully.jsp");
            req.forward(request, response);
        }

    }
}
