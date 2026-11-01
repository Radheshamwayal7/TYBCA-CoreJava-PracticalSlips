// Slip 7 (Q.2) Write a java program to define a class student having rollno, name and  
         // percentage. Define Default and parameterized   constructor. Overload  
         // the constructor. Accept the 5 student details and display it. (use this  
          //keyword).

import java.util.*;

class Student {
    int rollno;
    String name;
    double percentage;

    Student() {
        rollno = 0;
        name = "Unknown";
        percentage = 0;
    }

    Student(int r, String n, double p) {
        this.rollno = r;
        this.name = n;
        this.percentage = p;
    }

    void display() {
        System.out.println(rollno + "  " + name + "  " + percentage);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student obj = new Student();
        System.out.println("Default Constructor:");
        obj.display();

        Student s[] = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Student " + (i + 1));

            System.out.print("Enter Roll Number: ");
            int r = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String n = sc.nextLine();

            System.out.print("Enter Percentage: ");
            double p = sc.nextDouble();

            s[i] = new Student(r, n, p);
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < 5; i++) {
            s[i].display();
        }

        sc.close();
    }
}
