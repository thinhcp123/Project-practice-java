package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        // write your code here

        All all = new All();
        DepartmentList department = all.departmentList;

        Scanner sc = new Scanner(System.in);
        System.out.println("Xin chào bạn đến với chương trình tính lương");

        while (true) {
            System.out.println("--------------------");
            System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty");
            System.out.println("2. Hiển thị các bộ phận trong công ty");
            System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
            System.out.println("4. Thêm nhân viên mới vào công ty: bao gồm 2 loại");
            System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
            System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty");
            System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
            System.out.println("8. Thêm bộ phận ");
            System.out.print("Bạn chọn :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    all.display();

                    break;
                case 2:
                    department.displayDepartment();
                   break;
                case 3:
                    all.displayCheck();
                    break;

                case 4 :
                    System.out.println("Chọn 1 trong 2");
                    System.out.println("1.Thêm Nhân viên thông thường");
                    System.out.println("2.Thêm nhân viên là cấp quản lý");
                    System.out.println("Bạn Chọn: ");
                    String i = sc.next();

                    if(i.equals("1")){
                        all.addEmployee();
                    }else{
                         all.addManager();
                    }
                    break;
                case 5:
                    all.search();
                    break;
                case 6 :
                    all.displaySalary();
                    break;
                case 7:
                    all.displaySalaryHello();
                    all.displaySalary();
                    break;
                case 8 :
                    department.add();
                    break;
            }

        }
    }
}