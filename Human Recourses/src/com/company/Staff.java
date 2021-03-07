package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class Staff{
    private String idStaff;
    private String nameStaff;
    private int ageStaff;
    private int salaryStaff;
    private int dayWorkStaff;
    private String departmentWork;
    private int  dayOfStaff;


    public  Staff(){}
    public Staff (String idStaff, String nameStaff, int ageStaff, int salaryStaff, int dayWorkStaff, String departmentWork, int dayOfStaff) {
        this.idStaff = idStaff;
        this.nameStaff = nameStaff;
        this.ageStaff = ageStaff;
        this.salaryStaff = salaryStaff;
        this.dayWorkStaff = dayWorkStaff;
        this.departmentWork = departmentWork;
        this.dayOfStaff = dayOfStaff;
    }

    public String getIdStaff () {
        return idStaff;
    }

    public void setIdStaff (String idStaff) {
        this.idStaff = idStaff;
    }

    public String getNameStaff () {
        return nameStaff;
    }

    public void setNameStaff (String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public int getAgeStaff () {
        return ageStaff;
    }

    public void setAgeStaff (int ageStaff) {
        this.ageStaff = ageStaff;
    }

    public int getSalaryStaff () {
        return salaryStaff;
    }

    public void setSalaryStaff (int salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public int getDayWorkStaff () {
        return dayWorkStaff;
    }

    public void setDayWorkStaff (int dayWorkStaff) {
        this.dayWorkStaff = dayWorkStaff;
    }

    public String getDepartmentWork () {
        return departmentWork;
    }

    public void setDepartmentWork (String departmentWork) {
        this.departmentWork = departmentWork;
    }

    public int getDayOfStaff () {
        return dayOfStaff;
    }

    public void setDayOfStaff (int dayOfStaff) {
        this.dayOfStaff = dayOfStaff;
    }
    public abstract String  toString();
    public String display(){
        return String.format("%-15s%-15s",nameStaff,departmentWork);
    }



}
