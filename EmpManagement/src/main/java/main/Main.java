package main;

import dao.UserDao;
import daoimpl.EmployeeDaoImpl;
import daoimpl.UserDaoImpl;
import model.Employee;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

public class Main {
    static boolean isEnding = false;
    public static void displayEmployeeById(int id){

        EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();
        Employee employee = daoImpl.getEmployeeById(id);
        System.out.println(employee.toString());
            System.out.println("Nhan vien la " + id);
            System.out.println("Bạn muốn tiếp tục không : 0-Dừng 1- Tiếp tục ");
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
                    if(count ==0){
            isEnding = true;
        }
    }
    public static void showLogin(){
        boolean login = false;
        do{
            UserDaoImpl userDao = new UserDaoImpl();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quản lý nhân viên");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Email:");
            String email = scanner.nextLine();
            System.out.print("Pass:");
            String pass = scanner.nextLine();

            if (email != null && pass != null){
                login = true;
                System.out.println("Đăng nhập thành công");
                System.out.println(userDao.getUserByEmailAndPassword(email, pass));
                // Hiển thị menu chức năng hệ thông lớn hơn 8
                showMenu();
            }else {
                System.out.println("No Email or Pass");
            }
        }while (!login);
    }

    public static void showMenu(){

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" 1. Sreach Id :");
            System.out.println(" 2. Sreach Name :");
            System.out.println(" 3. Sreach Email :");
            System.out.println(" 4. Sreach NameId :");
            System.out.println(" 5. Add new :");
            System.out.println(" 6 .Update :");
            System.out.println(" 7. delete :");
            System.out.println(" 8. Exit :");
            String key = scanner.nextLine();
            switch (key) {
                case "1":
                    System.out.println("Ma nhan vien muon lay thong tin:");
                    int id = new Scanner(System.in).nextInt();
                    displayEmployeeById(id);
                    break;
                case "2":
                    System.out.println(" Name :");
                    break;
                case "3":
                    System.out.println(" Email :");
                    break;
                case "4":
                    System.out.println(" NameId :");
                    break;
                case "5":
                    System.out.println("Add new :");
                    break;
                case "6":
                    System.out.println("Update :");
                    addNewEmployee();
                    break;
                case "7":
                    System.out.println("delete :");
                    deleteAnEmployee();
                    break;
                case "8":
                    System.out.println("S reach Email :");

                    break;

                default:
                    isEnding = true;
                    System.out.println(" ok");
                    System.exit(0);
            }
        }while (!isEnding);
    }
    public static void displayEmployeeByName(String name) {
        System.out.println("Nhan vien la " + name);

    }


    public static void displayEmployeeByEmail(String email) {
        System.out.println("Nhan vien la " + email);
    }
    public  static void deleteAnEmploy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID : ");
        int id = sc.nextInt();
    }
    public static void addNewEmployee() {
        System.out.println("Them 1 nhan vien moi:");
        System.out.println("Ho va ten nhan vien:");
        String fullname = new Scanner(System.in).nextLine();
        System.out.println("email nhan vien:");
        String email = new Scanner(System.in).nextLine();

        Employee emp = new Employee(fullname, email);
        EmployeeDaoImpl edi = new EmployeeDaoImpl();
        edi.saveEmployee(emp);
    }
    public static void deleteAnEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhân viên cần xóa");
        EmployeeDaoImpl edi = new EmployeeDaoImpl();
        int empID = sc.nextInt();

//        edi.deleteEmployee(empID);
        if (edi.getEmployeeById(empID) != null){
            edi.deleteEmployee(empID);
        }else{
//            JOptionPane.showConfirmDialog(null, "Ma NV :" + empID);
            System.out.println("Nhận viên ko tồn tại");
        }
    }
    public static void main(String[] args) {
//        EmployeeDaoImpl empDao = new EmployeeDaoImpl();
//        List<Employee> employees = new ArrayList<>();
//        employees = empDao.getAllEmployees();
//        for (Employee employee : employees) {
//            System.out.println("Employee " + employee);
//
//        }


        //Blank workbook
        // tạo 1 sổ tính mới
        XSSFWorkbook workbook = new XSSFWorkbook();
        // Tọa ra 1 trang tính mới Tên Employee Data
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");

        //This data needs to be written (Object[])
        // tạo đối tượng lưu vào dữ liệu
        Map<String, Object[]> data = new TreeMap<String, Object[]>(); // dùng ojb vì ko chắc excel là kiểu gì
        data.put("1", new Object[] {"ID", "fullNAME", "email","hour","long word","fixed","outSideNumber","total"});
        List<Employee> employees = new ArrayList<>();
        EmployeeDaoImpl edi = new EmployeeDaoImpl();
        employees = edi.getAllEmployees();
for (Employee employee : employees) {

    data.put(String.valueOf(employee.getId()), new Object[]{
            employee.getId(),
            employee.getFullName(),
            employee.getEmail(),
            employee.getHourWordPerDay(),
            employee.getLongWord(),
            employee.getFixedSalary(),
            employee.getOutsideServiceNumber(),
            employee.getTotalSalary()});
    System.out.println("Employees: " + data);
}

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
