package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public abstract class GenericDAO {
    public Connection getConnection(){

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ex1", "root", "1721");
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

}
