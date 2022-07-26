package daoimpl;

import dao.EmployeeDao;
import dao.UserDao;
import model.Employee;
import model.User;
import ultils.DBConnection;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDaoImpl implements EmployeeDao {
    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public Employee getEmployeeById(int id) {

        try {
            DBConnection dbc = new DBConnection();
            dbc.connectDB();
            String sql = "SELECT* FROM employee where id = ?";

            PreparedStatement ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setFullName(rs.getString("fullname"));
                emp.setEmail(rs.getString("email"));
                emp.setHourWordPerDay(rs.getInt("hour_word_per_day"));
                emp.setLongWord(rs.getInt("long_word"));
                emp.setFixedSalary(rs.getInt("fixed_salary"));
                emp.setOutsideServiceNumber(rs.getInt("outside_service_number"));
                return emp;
            }
            dbc.disconnectDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return null;
    }

    @Override
    public void getEmployeeByEmail(String email) {

    }

    @Override
    public String getNameById(int id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {

//        String dbUrl = "jdbc:mysql://localhost:3306/employeemanagement";
        try {
            DBConnection dbc = new DBConnection();
            dbc.connectDB();
            String sql = "SELECT* FROM Employee";
            PreparedStatement ps = dbc.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
//            Connection conn = DriverManager.getConnection(dbUrl,"root","multi2022!");
//            String sql = "SELECT * FROM Employee";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            // sử lý kết quả trả về
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setFullName(rs.getString("fullname"));
                emp.setEmail(rs.getString("email"));
                emp.setHourWordPerDay(rs.getInt("hour_word_per_day"));
                emp.setLongWord(rs.getInt("long_word"));
                emp.setFixedSalary(rs.getInt("fixed_salary"));
                emp.setOutsideServiceNumber(rs.getInt("outside_service_number"));

                employees.add(emp);

            }
            //đã kêt nối
            dbc.disconnectDB();
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public void saveEmployee(Employee emp) {

        try {
            DBConnection dbc = new DBConnection();
            dbc.connectDB();
            String sql = "INSERT INTO Employee(fullname,email) VALUES (?,?)";
            PreparedStatement ps = dbc.getConn().prepareStatement(sql);
            ps.setString(1, emp.getFullName());
            ps.setString(2, emp.getEmail());
            int numberOfRecords = ps.executeUpdate();
            // Bước 3 xử lý kết quả trả về
            if (numberOfRecords > 0) {
                System.out.println("Thành công");
            } else {
                System.out.println("ko thể lưu  ");
            }
            dbc.disconnectDB();
//            ResultSet rs = ps.executeQuery();
//            Connection conn = DriverManager.getConnection(dbUrl,"root","multi2022!");
//            String sql = "SELECT * FROM Employee";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
            // sử lý kết quả trả về

            //đã kêt nối


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateEmployee(Employee emp) {


//    String sqlupdate = "UPDATE employee" + " SET fullname = ?" + "SET id =?";
//
//        DBConnection dbc = new DBConnection();
//        dbc.connectDB();
//
//        PreparedStatement ps =  dbc.getConn().prepareStatement(sqlupdate);
//        try (PreparedStatement ps =  dbc.getConn().prepareStatement(sqlupdate))
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            DBConnection dbc = new DBConnection();
            dbc.connectDB();
            //Định nghĩa câu truy vấn thực hiện câu truy vấn
            String sql = "DELETE FROM employee WHERE id = ?";
            PreparedStatement ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            //xác nhận từ người dùng
//            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure");
            System.out.println("Are you sure (yes = 1 - No = 0)");
            int confirm = new Scanner(System.in).nextInt();
            if (confirm == 1) {
                int numberOfRecords = ps.executeUpdate();
                if (numberOfRecords > 0) {
                    System.out.println("Thành công");
                } else {
                    System.out.println("ko thể lưu  ");
                }
            }
            // Bước 3 xử lý kết quả trả về
            dbc.disconnectDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
