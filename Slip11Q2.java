
// Q.2) Write a Java program to define a class Employee having members – id,
// name, department, salary. Define default and parameterized constructors.
// Create a subclass called Worker with private member bonus. Define methods
// accept and display in both the classes. Create ‘n’ objects of the Worker
// class and display the details of the worker having the maximum total salary
// (salary + bonus).

import java.util.*;

class Employee {
    int id;
    String name, department;
    double salary;

    Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0;
    }

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void accept(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Worker extends Employee {
    private double bonus;

    Worker() {
        super();
        bonus = 0;
    }

    void accept(Scanner sc) {
        super.accept(sc);

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    double totalSalary() {
        return salary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary());
    }
}

class Slip11Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of workers: ");
        int n = sc.nextInt();

        Worker w[] = new Worker[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Worker " + (i + 1));
            w[i] = new Worker();
            w[i].accept(sc);
        }

        int max = 0;

        for (int i = 1; i < n; i++) {
            if (w[i].totalSalary() > w[max].totalSalary()) {
                max = i;
            }
        }

        System.out.println("\nWorker Having Maximum Total Salary:");
        w[max].display();

        sc.close();
    }
}
