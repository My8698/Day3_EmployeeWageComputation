package com.bridgelabz;
public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static int computeEmpWage(String companyName,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH ) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        System.out.println("Company Name:"+companyName);
        System.out.println("Rate Per Hour:"+EMP_RATE_PER_HOUR);
        System.out.println("Number of working days:"+NUM_OF_WORKING_DAYS);
        System.out.println("Maximum working hours in month:"+MAX_HRS_IN_MONTH);
        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {
                  totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days#: " + totalWorkingDays + "Emp Hrs:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args)
    {
        computeEmpWage("Amazon",30,20,200);
        computeEmpWage("Flipkart",20,10,100);
        computeEmpWage("Myntra",10,5,50);
    }
}


