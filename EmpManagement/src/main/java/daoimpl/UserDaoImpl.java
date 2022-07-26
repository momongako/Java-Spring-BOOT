package daoimpl;

import dao.UserDao;
import model.Employee;
import model.User;
import ultils.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public User getUserByEmailAndPassword(String email, String pass) {
        String dbUrl = "jdbc:mysql://localhost:3306/employeemanagement";
        try {
            DBConnection dbc = new DBConnection();
            dbc.connectDB();
            // Định nghĩa câu truy vấn và thực hiện truy vấn
            String sql = "SELECT* FROM user WHERE email = ? AND  password = ?";
            PreparedStatement ps =  dbc.getConn().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
//            Connection conn = DriverManager.getConnection(dbUrl,"root","multi2022!");
//            String sql = "SELECT * FROM Employee";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            // sử lý kết quả trả về
          if(rs.next()){
              // tạo đối tượng lưu thông tin bản ghi
              User u = new User();
              u.setEmail(rs.getString("email"));
              u.setFirstName(rs.getString("firstname"));
              u.setLastName(rs.getString("lastname"));

              dbc.disconnectDB();
              return u;
          } else {
              return null;
          }
            //đã kêt nối

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
