
// Q.1) Write a java program to calculate area of Cylinder and Circle.
// (Use super keyword)

import java.util.*;

class Slip21Circle {
    double r;

    Slip21Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.142 * r * r;
    }
}

class Slip21Cylinder extends Slip21Circle {
    double h;

    Slip21Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    double area() {
        return 2 * super.area() + 2 * 3.142 * r * h;
    }
}

class Slip21Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Slip21Circle c = new Slip21Circle(r);
        Slip21Cylinder cy = new Slip21Cylinder(r, h);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Cylinder: " + cy.area());

        sc.close();
    }
}
