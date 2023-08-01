package DAO;

import DTO.BookDTO;
import Model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class BookDAO extends GenericDAO{
    public String insert(BookDTO book){
        String query = "INSERT INTO sach" + "(MaSach, TenSach, MaTL, MaNXB, MaTG, SL, GiaTien, Hinh, UuTien, MaDM) VALUES" + "(?,?,?,?,?,?,?,?,?,?);";
        List<Object> list = new ArrayList<Object>();
        list.add("ID"+ book.name);
        list.add(book.name);
        list.add(book.genreID);
        list.add(book.publisherID);
        list.add(book.authorID);
        list.add(book.quantity);
        list.add(book.price);
        list.add(book.images);
        list.add(book.priority);
        list.add(book.categoryID);
        return insertModel(query, list);
    }

    public List<Book> getAll(){
        List<Book> listBook = new ArrayList<>();
        String query = "SELECT *FROM sach";
        Connection conn = getConnection();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery(query);

            while (rs.next()){
                Book book = new Book();
                book.setBookID(rs.getString(1));
                book.setName(rs.getString(2));
                book.setGenreID(rs.getString(3));
                book.setPublisherID(rs.getString(4));
                book.setAuthorID(rs.getString(5));
                book.setQuantity(rs.getInt(6));
                book.setPrice(rs.getInt(7));
                book.setImages(rs.getString(8));
                book.setPriority(rs.getInt(9));
                book.setCategoryID(rs.getString(10));
                listBook.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    return listBook;
    }
}
