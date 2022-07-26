import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteExcelDemo {

    public List getAllEmployees() throws SQLException {
        List<Employee> employees =new ArrayList<Employee>();

        String dbUrl = "jdbc:mysql://localhost:3306/employeemanagement";
        try {
            Connection conn = DriverManager.getConnection(dbUrl,"root","gokuzz100");
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
    public static void main(String[] args)
    {
        //Blank workbook
        // tạo 1 sổ tính mới
        XSSFWorkbook workbook = new XSSFWorkbook();
        // Tọa ra 1 trang tính mới Tên Employee Data
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");

        //This data needs to be written (Object[])
        // tạo đối tượng lưu vào dữ liệu
        Map<String, Object[]> data = new TreeMap<String, Object[]>(); // dùng ojb vì ko chắc excel là kiểu gì
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shukla"});
        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
        data.put("4", new Object[] {3, "John", "Adwards"});
        data.put("5", new Object[] {4, "Brian", "Schultz"});

        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) // duyệt bản ghi thông qua key
        {
            Row row = sheet.createRow(rownum++); // chỉ số hàng chạy của excel
            Object [] objArr = data.get(key); // thông qua key lấy data tương ứng từng hàng
            int cellnum = 0; // trong 1 hàng, có nhiều cột > chạy chỉ số cột
            for (Object obj : objArr)
            {
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String) // kiểm tra kiểu dữ liệu là kiểu chuỗi
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);// kiểm tra nếu dữ liệu là kiểu số
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("D:\\howtodoinjava_demo.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
