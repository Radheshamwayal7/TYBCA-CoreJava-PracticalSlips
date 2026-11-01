 
// (Q.2) Write a java program to create an abstract class Shape with methods  
//  area & volume. Derive two classes Sphere (radius), Cylinder (radius,  
//  height) from it. Calculate area and volume of both. (Use Method Overriding) 

abstract class Shape {
    abstract void area();
    abstract void volume();
}

class Sphere extends Shape {
    double r = 5;

    void area() {
        System.out.println("Sphere Area = " + (4 * 3.14 * r * r));
    }

    void volume() {
        System.out.println("Sphere Volume = " + (4.0 / 3 * 3.14 * r * r * r));
    }
}

class Cylinder extends Shape {
    double r = 5, h = 10;

    void area() {
        System.out.println("Cylinder Area = " + (2 * 3.14 * r * (r + h)));
    }

    void volume() {
        System.out.println("Cylinder Volume = " + (3.14 * r * r * h));
    }
}

class Slip5Q2 {
    public static void main(String[] args) {

        Sphere s = new Sphere();
        Cylinder c = new Cylinder();

        s.area();
        s.volume();

        c.area();
        c.volume();
    }
}
