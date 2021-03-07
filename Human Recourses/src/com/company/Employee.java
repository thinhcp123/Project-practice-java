package com.company;

public class Employee extends Staff implements ICalculator{
    private int overTime;

    public Employee(){}

    public Employee (String idStaff, String nameStaff, int ageStaff, int salaryStaff, int dayWorkStaff, String departmentWork, int dayOfStaff, int overTime) {
        super(idStaff, nameStaff, ageStaff, salaryStaff, dayWorkStaff, departmentWork, dayOfStaff);
        this.overTime = overTime;
    }

    public int getOverTime () {
        return overTime;
    }

    public void setOverTime (int overTime) {
        this.overTime = overTime;
    }

    @Override
    public String toString () {
        return String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s",getIdStaff(),getNameStaff(),getAgeStaff(),getSalaryStaff(),getDayWorkStaff(), getDepartmentWork(),getDayOfStaff());
    }
//Lương nhân viên
    @Override
    public int calculateSalary () {
        return getSalaryStaff() * 3000000 + getOverTime() * 200000;

    }





}
