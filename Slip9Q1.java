
// Slip 9 Q.1) Write a java program to calculate area of Cylinder and Circle. (use
// super keyword)

import java.util.*;

class Slip9Circle {
    double r;

    Slip9Circle(double r) {
        this.r = r;
    }

    double area() {
        return 3.14 * r * r;
    }
}

class Slip9Cylinder extends Slip9Circle {
    double h;

    Slip9Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    double area() {
        return 2 * super.area() + 2 * 3.14 * r * h;
    }
}

class Slip9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Slip9Circle c = new Slip9Circle(r);
        Slip9Cylinder cy = new Slip9Cylinder(r, h);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Cylinder: " + cy.area());

        sc.close();
    }
}
