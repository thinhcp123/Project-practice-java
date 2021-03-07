package com.company;

import java.sql.ClientInfoStatus;

public class Manager extends  Staff implements ICalculator{
    private String position;
    public Manager(){}
    public Manager (String idStaff, String nameStaff, int ageStaff, int salaryStaff, int dayWorkStaff, String departmentWork, int dayOfStaff, String position) {
        super(idStaff, nameStaff, ageStaff, salaryStaff, dayWorkStaff, departmentWork, dayOfStaff);
        this.position = position;
    }

    public String getPosition () {
        return position;
    }

    public void setPosition (String position) {
        this.position = position;
    }


    
    @Override
    public String toString(){
        return String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s",getIdStaff(),getNameStaff(),getAgeStaff(),getSalaryStaff(),getDayWorkStaff(), getDepartmentWork(),getDayOfStaff());
    }

    @Override
    public int calculateSalary() {
        if ( position != null && position.equals("Business Leader")){
            return getSalaryStaff() * 5000000 + 8000000;

        }
        else if ( position != null && position.equals("Project Leader")){
            return getSalaryStaff() * 5000000 + 5000000;

        }
        else if (position != null && position.equals("Technical Leader")) {
            return getSalaryStaff() * 5000000 + 6000000;

        }


     return 0;
    }

}
