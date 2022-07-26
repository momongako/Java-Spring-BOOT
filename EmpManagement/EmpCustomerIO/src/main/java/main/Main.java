package main;

import model.Customer;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    // Properties
    private static List<Customer> listOfCustomer = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        inputListOfCustomers();
        printListOfCustomer();
        saveDataToFile();
    }

    // Nhập danh sách khách hàng
    public static void inputListOfCustomers() throws ParseException {
        System.out.println("So khach hang can nhap :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Customer cus = new Customer();
            System.out.println("Khach hang thu: " + i);
            System.out.println("Ma khach hang: " );
            int id = sc.nextInt();
            System.out.println("Ho va ten khach hang");
            sc.nextLine();
            String fullName = sc.nextLine();
            System.out.println("Nam sinh khach hang");

            Date yOB = new SimpleDateFormat("yyyy").parse(sc.nextLine());

            cus.setId(id);
            cus.setFullName(fullName);
            cus.setYearOfBirth(yOB);

            listOfCustomer.add(cus);
        }
    }

    // Cho xuất danh sách khách hàng ra màn hình
    public static void printListOfCustomer() {
        for (Customer c : listOfCustomer){
            System.out.println(c.toString());
        }
    }
    // lưu danh sách khách hàng vào ổ cứng
    public static void saveDataToFile(){
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        long start = System.nanoTime();
        try(FileOutputStream fos = new FileOutputStream(file)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            if (!file.exists()){
                file.createNewFile();

            }
//            for (Customer c : listOfCustomer){
//                fw.write(c.toString());
//                fw.write("\n");
//
//            }
            oos.writeObject(listOfCustomer);
            System.out.println("Done");

        }catch(IOException e){
            e.printStackTrace();
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
    }









}