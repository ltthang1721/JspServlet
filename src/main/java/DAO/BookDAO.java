package DAO;

import DTO.BookDTO;

import java.util.ArrayList;
import java.util.List;

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
}
