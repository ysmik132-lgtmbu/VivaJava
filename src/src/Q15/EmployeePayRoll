//Bhudev Katawal 116237 BIT sec "P"

import java.io.*;
import java.util.ArrayList;

class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculatePay() {
        return 0;
    }
}

class FullTime extends Employee {

    FullTime(String name) {
        super(name);
    }

    double calculatePay() {
        return 50000;
    }
}

class Contractor extends Employee {

    Contractor(String name) {
        super(name);
    }

    double calculatePay() {
        return 25000;
    }
}

public class EmployeePayroll {

    public static void main(String[] args) {

        ArrayList<Employee> staff =
                new ArrayList<>();
        // Store employees

        staff.add(
                new FullTime("Ram"));

        staff.add(
                new Contractor("Hari"));

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                    new FileWriter(
                    "payroll_report.txt"));
            // Create payroll file

            for(Employee e : staff) {

                bw.write(
                        e.name + " : " +
                        e.calculatePay());

                bw.newLine();
                // Write employee pay
            }

            bw.close();

            System.out.println(
                    "Payroll report created");
        }

        catch(IOException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}
