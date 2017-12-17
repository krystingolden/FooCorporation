package com.pluralsight;

public class Main {

/*
https://ocw.mit.edu/courses/electrical-engineering-and-computer-science
/6-092-introduction-to-programming-in-java-january-iap-2010/assignments/

Assignment #2 FooCorporation
 */
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        System.out.print("Employee 1: ");
        employee1.getPay(7.50, 35);

        Employee employee2 = new Employee();
        System.out.print("Employee 2: ");
        employee2.getPay(8.20, 47);

        Employee employee3 = new Employee();
        System.out.print("Employee 3: ");
        employee3.getPay(10.00, 73);
/*
An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
For every hour over 40, they get overtime = (base pay) × 1.5.
The base pay must not be less than the minimum wage ($8.00 an hour).If it is, print an error.
If the number of hours is greater than 60, print an error message.

Create a new class called FooCorporation.

Write a method that takes the base pay and hours worked as parameters,
and prints the total pay or an error. Write a main method that calls this method for each of these employees:

            Base Pay    Hours Worked
Employee 1  $7.50            35
Employee 2  $8.20            47
Employee 3  $10.00           73

 */




    }
}
