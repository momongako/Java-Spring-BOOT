package main;

import daoimpl.EmployeeDaoImpl;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoImpl empDao = new EmployeeDaoImpl();
        List<Employee> employees = new ArrayList<>();
        employees = empDao.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println("Employee " + employee);
        }



    }
}
