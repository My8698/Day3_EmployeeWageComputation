package com.bridgelabz;
public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;
    public EmployeeWage() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String companyName, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, EMP_RATE_PER_HOUR, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
        numOfCompany++;
    }
    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.MAX_HRS_IN_MONTH &&
                totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAYS) {
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
        return totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOUR;
    }
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("Amazon", 20, 3, 10);
        employeeWage.addCompanyEmpWage("Flipkart", 10, 3, 20);
        employeeWage.computeEmpWage();
     }
     public class CompanyEmpWage {
        public final String companyName;
        public final int EMP_RATE_PER_HOUR;
        public final int NUM_OF_WORKING_DAYS;
        public final int MAX_HRS_IN_MONTH;
        public int totalEmpWage;
        public CompanyEmpWage(String companyName, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
            this.companyName = companyName;
            this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
            this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
            this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
        }
        public void setTotalEmpWage(int totalEmpWage) {
            this.totalEmpWage = totalEmpWage;
        }

        public String toString() {
            return "Total Emp Wage for company is " + companyName + " : " + totalEmpWage;
        }
    }
}



