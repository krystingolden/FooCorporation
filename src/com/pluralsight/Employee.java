package com.pluralsight;

public class Employee {

    private double totalPay, standardPay, overtimePay = 0.0;
    private double minWage = 8.00;
    private int hrsMax = 60;
    private int hrsStandard = 40;
    private double overtimeMultiplier = 1.5;


    public Employee() {
    }


    public void getPay (double basePay, int hrsWorked){
        if (basePay < minWage) {
            System.out.println("Wage is too low");
        }
        else if (hrsWorked > hrsMax) {
            System.out.println("Too many hours");
        }
        else
        {
            standardPay = basePay * (Math.min(hrsWorked,hrsStandard));
            overtimePay = basePay * overtimeMultiplier * (Math.max(0,hrsWorked-hrsStandard));
            totalPay = standardPay + overtimePay;
            System.out.print("Standard pay is $" + standardPay);
            System.out.print("  Overtime pay is $" + overtimePay);
            System.out.println("  Total pay is $" + totalPay);
        }

    }

}
