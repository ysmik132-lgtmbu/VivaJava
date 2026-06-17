abstract class Employee {//Q6

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;//instance variable
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Consultant extends Employee {

    double percentage;

    Consultant(String name,
               double salary,
               double percentage) {

        super(name, salary);// refering to parent class
        this.percentage = percentage;
    }

    double calculateBonus() {
        return salary * percentage;
    }
}

class Payroll {

    public static void main(String[] args) {

        Manager m =
                new Manager("John", 50000);

        Consultant c =
                new Consultant("David",
                        40000,
                        0.10);

        System.out.println(
                "Manager Bonus = " +
                        m.calculateBonus());

        System.out.println(
                "Consultant Bonus = " +
                        c.calculateBonus());
    }
}
