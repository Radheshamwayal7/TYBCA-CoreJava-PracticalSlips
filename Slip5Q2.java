 
// (Q.2) Write a java program to create an abstract class Shape with methods  
//  area & volume. Derive two classes Sphere (radius), Cylinder (radius,  
//  height) from it. Calculate area and volume of both. (Use Method Overriding) 


import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void volume();
}

class Sphere extends Shape {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Sphere Area = " + (4 * 3.14 * r * r));
    }

    void volume() {
        System.out.println("Sphere Volume = " + (4.0 / 3 * 3.14 * r * r * r));
    }
}

class Cylinder extends Shape {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void area() {
        System.out.println("Cylinder Area = " + (2 * 3.14 * r * (r + h)));
    }

    void volume() {
        System.out.println("Cylinder Volume = " + (3.14 * r * r * h));
    }
}

class Slip5Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sphere Radius: ");
        double r1 = sc.nextDouble();

        Sphere s = new Sphere(r1);

        System.out.print("Enter Cylinder Radius: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter Cylinder Height: ");
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r2, h);

        s.area();
        s.volume();

        c.area();
        c.volume();

        sc.close();
    }
}
