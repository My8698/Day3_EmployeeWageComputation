package com.bridgelabz;
public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String companyName;
    private final int EMP_RATE_PER_HOUR;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;
    private int totalEmpWage;
    EmployeeWage(String companyName,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH ) {
        this.companyName = companyName;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
    }
    public void computeEmpWage(){
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
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
            System.out.println("Day#: " + totalWorkingDays + "Emp Hrs:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
    }
    public String toString(){
        return "Total Emp Wage for company is " +companyName+ " : " +totalEmpWage;
    }
    public static void main(String[] args)
    {
        EmployeeWage amazon=new EmployeeWage("Amazon",20,3,10);
        EmployeeWage flipkart=new EmployeeWage("Flipkart",10,3,20);
        amazon.computeEmpWage();
        System.out.println(amazon);
        flipkart.computeEmpWage();
        System.out.println(flipkart);
       }
}


