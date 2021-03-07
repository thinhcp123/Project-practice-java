package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class All {
    Scanner sc = new Scanner(System.in);
    List<Staff> list = new ArrayList<>();
    DepartmentList departmentList = new DepartmentList();

    //Nhập Quản lý
    public void addManager(){

        System.out.println("Enter information fo the new Employee");

        System.out.print("ID: ");
        String id = sc.nextLine();
        sc.nextLine();
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Salary: ");
        int salary = Integer.parseInt(sc.nextLine());
        System.out.print("DayWork: ");
        int dayWork = Integer.parseInt(sc.nextLine());
        System.out.print("Department :");
        String departmentWork = sc.nextLine();
        boolean hello = check(departmentWork);
        if (!hello){
            System.out.println("Phòng ban này không có ! Hãy nhập thêm phòng ban ở chức năng thứ 8 .");
            return;
        }
        System.out.print("DayOfStaff: ");
        int dayOfStaff = Integer.parseInt(sc.nextLine());
        System.out.print("position: ");
        String position = sc.nextLine();

        addMyManager(id.toUpperCase(), name, age, salary, dayWork, departmentWork, dayOfStaff, position);
    }
    //Thêm quản lý vào mảng
    public void addMyManager(String idStaff, String nameStaff, int ageStaff, int salaryStaff, int dayWorkStaff, String departmentWork, int dayOfStaff, String position){

        Staff manager = new Manager(idStaff.toUpperCase(), nameStaff, ageStaff, salaryStaff, dayWorkStaff, departmentWork,dayOfStaff, position);
        list.add(manager);
    }
    //Thêm nhân viên
    public void addEmployee () {
        System.out.println("Enter information fo the new Employee");

        System.out.print("ID: ");
        String id = sc.next();
        System.out.print("Name:");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Salary: ");
        int salary = sc.nextInt();
        System.out.print("DayWork: ");
        int dayWork = sc.nextInt();
        System.out.print("Department :");

        String departmentWork = sc.next();
        boolean hello = check(departmentWork);
        if (!hello){
            System.out.println("Phòng ban này không có ! Hãy nhập thêm phòng ban ở chức năng thứ 8 .");
            return;
        }
        System.out.print("DayOfStaff: ");
        int dayOfStaff = sc.nextInt();
        System.out.print("OverTime: ");
        int overTime = sc.nextInt();
        addMyEmployee(id.toUpperCase(), name, age, salary, dayWork, departmentWork, dayOfStaff, overTime);
    }

    //Thêm nhân viên vào mảng
    public void addMyEmployee (String idStaff, String nameStaff, int ageStaff, int salaryStaff, int dayWorkStaff, String departmentWork, int dayOfStaff, int overtime) {

        Staff employee = new Employee(idStaff.toUpperCase(), nameStaff, ageStaff, salaryStaff, dayWorkStaff, departmentWork, dayOfStaff, overtime);
        list.add(employee);

    }

    //Hiển thị danh sách nhân viên hiện có trong công ty
    public void display  () {
        if (list.isEmpty()) {
            System.out.println("Danh sách nhân viên không có ai ! Hãy thêm vào.");
        }
        else{
            System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "ID", "Name", "Age", "Salary", "DayWork", "Department", "DayOfStaff"));
            for (Staff i : list) {
                System.out.println(i.toString());
            }
        }
    }


    //Hiển thị các nhân viên theo từng bộ phận
    public void displayCheck(){
        if(list.isEmpty()){
            System.out.println("Danh sách nhân viên không có ai ! Hãy thêm vào");
        }
        else {
            System.out.println(String.format("%-15s%-15s", "Name", "Department"));
            for (Staff i : list) {
                System.out.println(i.display());
            }
        }
    }

    //Check xem phòng ban đầu nhan viên nhập giống với phòng ban hay không >
    public Boolean check(String departmentWork){
        for (Department department : departmentList.lists){
            if (department.getNameDepartment().equals(departmentWork)){
                return true;

            }

        }return false;

    }

    //Tìm kiếmhông tin nhân viên theo tên
   public void search(){
        System.out.println("Nhập mã nhân viên cần tìm.");
        System.out.println("ID Nhân viên : ");
        String searchKey = sc.next();
        List<Staff> displayId = new ArrayList<>();

        for(Staff staff : list){
            if(staff.getIdStaff().contains(searchKey.toUpperCase())){
                displayId.add(staff);
            }
        }

        if(displayId.isEmpty()){
            System.out.println("Không có nhân viên trong này ");
        }else{
            System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "ID", "Name", "Age", "Salary", "DayWork", "Department", "DayOfStaff"));
            for(Staff staff : displayId){
                System.out.println(staff.toString());
            }
        }
    }

    //Tính lương của nhân viên và lương của quản lý !
    public void displaySalary () {
        if (list.isEmpty()) {
            System.out.println("Danh sách nhân viên không có ai ! Hãy thêm vào.");
        } else {
            System.out.println(String.format("%-15s%-15s%-15s", "Name", "id", "Salary"));
            for (Staff a : list) {
                if (a instanceof Employee) {

                    System.out.printf("%15s%5d ", a.display(), ((Employee) a).calculateSalary());
                    System.out.println("");
                }
                if (a instanceof Manager) {

                    System.out.printf("%15s%5d ", a.display(), ((Manager) a).calculateSalary());

                    System.out.println("");
                }
            }
        }


        }
        //Sắp xếp nhân viên
        public int displaySalaryHello() {
            Collections.sort(list, new Comparator() {

                public int compare (Object arg0, Object arg1) {
                    if (!(arg0 instanceof Employee)) {
                        return 1;
                    }
                    if (!(arg1 instanceof Manager)) {
                        return -1;
                    }

                    int pers0 = ((Employee) arg0).calculateSalary();
                    int pers1 = ((Manager) arg1).calculateSalary();


                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = 0; j < list.size() - i - 1; j++) {
                            if (pers0 > pers1) {
                                // swap List[j+1] và List[i]
                                Staff temp = list.get(j);
                                list.set(j, list.get(j + 1));
                                list.set(j + 1, temp);
                            }
                        }
                    }
                    return pers0;

                }
            });
            return 0;

        }

    }



