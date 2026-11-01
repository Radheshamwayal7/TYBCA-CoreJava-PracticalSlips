
// Q.2) Define an interface “Operation” which has methods area(),volume().
// Define a constant PI having a value 3.142. Create a class circle
// (member – radius), cylinder (members – radius, height) which implements
// this interface. Calculate and display the area and volume.

import java.util.*;

interface Operation1 {
    double PI = 3.142;

    void area();
    void volume();
}

class Circle1 implements Operation1 {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle: " + (PI * radius * radius));
    }

    public void volume() {
        System.out.println("Volume is not applicable for Circle.");
    }
}

class Cylinder1 implements Operation1 {
    double radius, height;

    Cylinder1(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        double a = 2 * PI * radius * (radius + height);
        System.out.println("Area of Cylinder: " + a);
    }

    public void volume() {
        double v = PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + v);
    }
}

class Slip21Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Circle1 c = new Circle1(r);
        Cylinder1 cy = new Cylinder1(r, h);

        c.area();
        c.volume();

        cy.area();
        cy.volume();

        sc.close();
    }
}
