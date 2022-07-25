package daoimpl;

import dao.EmployeeDao;
import dao.UserDao;
import model.Employee;
import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao, UserDao {

    @Override
    public Employee getEmployeeById(int id) {
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
        List<Employee> employees = new ArrayList<Employee>();
        String dbUrl = "jdbc:mysql://localhost:3306/employeemanagement";
        try {
            Connection conn = DriverManager.getConnection(dbUrl,"root","multi2022!");
            String sql = "SELECT * FROM Employee";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
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
            conn.close();
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public void saveEmployee(Employee emp) {

    }

    @Override
    public void updateEmployee(Employee emp) {

    }

    @Override
    public void deleteEmployee(Employee emp) {

    }

    @Override
    public User getUserByEmailAndPassword(String user, String pass) {
        return null;
    }
}
