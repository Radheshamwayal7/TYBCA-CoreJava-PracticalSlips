
// Q.2) Write a Java program to define an interface “Operation” which has
// Methods, area(), volume(). Define a constant PI having a value of 3.142.

import java.util.*;

interface Operation {
    double PI = 3.142;

    void area();
    void volume();
}

class Cylinder implements Operation {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void area() {
        double a = 2 * PI * r * (r + h);
        System.out.println("Area of Cylinder: " + a);
    }

    public void volume() {
        double v = PI * r * r * h;
        System.out.println("Volume of Cylinder: " + v);
    }
}

class Slip16Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r, h);

        c.area();
        c.volume();

        sc.close();
    }
}
