package Service;

import DAO.BookDAO;
import DTO.BookDTO;

public class BookService {
    private static final BookDAO bookDAO = new BookDAO();
    public boolean isNameExist(String name){
        if(bookDAO.getIdByName(name) != null){
            return true;
        }
        return false;
    }
}
