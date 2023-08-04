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
        String query = "INSERT INTO book" + "(bookID, name, genreID, publisherID, authorID, quantity, price, images, priority, categoryID) VALUES" + "(?,?,?,?,?,?,?,?,?,?);";
        List<Object> list = new ArrayList<Object>();

        list.add(autoIncrease("BOOK",1));
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
        String query = "SELECT *FROM book";
        Connection conn = getConnection();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery(query);

            while (rs.next()){
                Book book = new Book();
                book.setBookID(rs.getString(1));
                book.setName(rs.getString(2));
                book.setGenreID(rs.getString(7));
                book.setPublisherID(rs.getString(8));
                book.setAuthorID(rs.getString(9));
                book.setQuantity(rs.getInt(3));
                book.setPrice(rs.getFloat(4));
                book.setImages(rs.getString(5));
                book.setPriority(rs.getInt(6));
                book.setCategoryID(rs.getString(10));
                listBook.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    return listBook;
    }

    public String autoIncrease(String s, int increase){
        String idNumber = "00000000";
        int lengthIdNumber = idNumber.length();
        int idIncrease = 1;
        String id = getLastID();
        if(id == null){
           idNumber = idNumber.substring(s.length()-1, lengthIdNumber);
        } else {
            int lengthId = id.length();
            idNumber = id.substring(s.length(), lengthId);
            int idInt = Integer.parseInt(idNumber);
            idIncrease = idInt + increase;
            String idS =  String.valueOf(idInt+increase);
            idNumber = idNumber.substring(0, idNumber.length()- idS.length());
        }
        return s + idNumber + idIncrease;
    }

    public String getIdByName(String name){
        String query = "SELECT bookID FROM book WHERE name= ?";
        PreparedStatement preparedStatement = null;
        Connection conn = getConnection();
        String id = null;
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()){
               id = rs.getString(1);
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return id;
    }
}
