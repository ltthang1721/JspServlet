import DAO.*;
import Model.Book;

import java.util.List;

public class hello{
    public static void main(String[] args){
        BookDAO bookDAO = new BookDAO();
//        bookDAO.insertModel(new BookDTO("Book1",10,120000,"book1.png",1,"Id1","Id2","id3","id4"));
        List<Book> books = bookDAO.getAll();
        for(int i =0; i< books.size(); i++){
            books.get(i).toString();
        }
        for(int i =0; i< bookDAO.getAll().size(); i++){
            bookDAO.getAll().get(i).toString();
        }
    }
}