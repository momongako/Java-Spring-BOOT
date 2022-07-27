package usemanagement.dao;


import usemanagement.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/webproject";
    private String jdbcUserName = "root";
    private String jdbcPassword = "multi2022!";

    private static final String SELECT_ALL_USERS = "select*from usename";
    private static final String SELECT_USER_BY_ID = "select id, fname,email,country from usename where id = ? ";
    public UserDao() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
     public List<User> selectAllUsers(){
        List<User> users = new ArrayList<User>();

        try(Connection conn = getConnection();

            PreparedStatement stmt = conn.prepareStatement(SELECT_ALL_USERS);
        ) {
            System.out.println(stmt);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("fname");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id,name, email, country));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
     }

     public User selectUser(int id){
         User users = null;

         try(Connection conn = getConnection();

             PreparedStatement stmt = conn.prepareStatement(SELECT_USER_BY_ID);

         ) {
             stmt.setInt(1, id);
             System.out.println(stmt);
             ResultSet rs = stmt.executeQuery();

             while (rs.next()) {

                 String name = rs.getString("fname");
                 String email = rs.getString("email");
                 String country = rs.getString("country");
                 users = new User(id, name, email, country);
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
        return users;
     }
}
