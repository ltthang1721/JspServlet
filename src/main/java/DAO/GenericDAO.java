package DAO;

import Model.Book;

import java.sql.*;
import java.util.List;

public abstract class GenericDAO {
    public Connection getConnection(){

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore", "root", "17201");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public <T> T insertModel(String query, List<Object> list){
        try {
            Connection conn = getConnection();
            conn.prepareStatement(query);
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            for (int i=0; i< list.size(); i++){
                preparedStatement.setObject(i+1, list.get(i));
            }
            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println("Thêm thành công " + row ); //
        }
        catch (SQLException e){
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return null;
    }
    public String getLastID(){
        String query = "SELECT bookID FROM book ORDER BY bookID DESC LIMIT 1;";
        Connection conn = getConnection();
        String id = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn.prepareStatement(query);
            preparedStatement = conn.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            if(rs.next()){
               id = rs.getString(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
                try {
                    assert preparedStatement != null;
                    preparedStatement.close();
                    assert rs != null;
                    rs.close();
                    conn.close();
                } catch (SQLException e) {
                    System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
                }
        }
        return id;
    }
}
