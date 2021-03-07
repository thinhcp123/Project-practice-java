package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Phòng ban
public class DepartmentList {


    List<Department> lists = new ArrayList<>();
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ID Department: ");
        String id = sc.next();
        System.out.print("Name Department:");
        String name = sc.next();
        System.out.print("present Department: ");
        int presentDepartment = sc.nextInt();
        addToDepartment(id.toUpperCase(),name,presentDepartment);

    }
    public void addToDepartment(String idDepartment , String nameDepartment , int presentEmployees){
        Department department = new Department(idDepartment.toUpperCase(), nameDepartment, presentEmployees);
        lists.add(department);

    }

    public void displayDepartment(){
        if(lists.isEmpty()){
            System.out.println("Bạn hãy thêm bộ phận vào");
        }
        else{
            System.out.println(String.format("%-15s","Department: "));
            for(Department i : lists) {
                System.out.println(i.toStrings());

            }
        }
    }
}
