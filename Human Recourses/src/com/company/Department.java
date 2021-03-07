package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
    private String idDepartment;
    private String nameDepartment;
    private int presentEmployees;
    public Department(){}

    public Department(String idDepartment, String nameDepartment, int presentEmployees) {
        this.idDepartment = idDepartment;
        this.nameDepartment = nameDepartment;
        this.presentEmployees = presentEmployees;
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public int getPresentEmployees() {
        return presentEmployees;
    }

    public void setPresentEmployees(int presentEmployees) {
        this.presentEmployees = presentEmployees;
    }


    public String toString() {
        return String.format("%-15s%-15s%-15s",idDepartment,nameDepartment,presentEmployees);
    }

    public String toStrings(){

        return  String.format("%-15s",getNameDepartment());
    }

}
