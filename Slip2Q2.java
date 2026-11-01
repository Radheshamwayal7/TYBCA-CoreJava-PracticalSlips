
interface Area {
    void area();
}

class Rectangle implements Area {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area() {
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}

class Square extends Rectangle {

    Square(int side) {
        super(side, side);
    }
}

class Circle implements Area {
    int radius;

    Circle(int r) {
        radius = r;
    }

    public void area() {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

public class Slip2Q2 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(5);
        Circle c = new Circle(7);

        r.area();
        System.out.println("Square Area = " + (s.length * s.breadth));
        c.area();
    }
}
