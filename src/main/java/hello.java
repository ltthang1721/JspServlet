import DAO.*;
import DTO.BookDTO;
import Model.Book;

import java.util.List;

public class hello{
    public static void main(String[] args){
        BookDAO bookDAO = new BookDAO();
//        bookDAO.insert(new BookDTO("Book1","10","120000","book1.png",1,1234,"Id2",1,"id4"));
//        List<Book> books = bookDAO.getAll();
//        for(int i =0; i< books.size(); i++){
//            books.get(i).toString();
//        }

//        System.out.println(bookDAO.autoIncrease("BOO",2));
//        System.out.println(bookDAO.getLastID());
        System.out.println(bookDAO.getIdByName("Tắt Đèn"));

    }
}