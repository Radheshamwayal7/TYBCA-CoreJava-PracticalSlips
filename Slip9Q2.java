
//Slip 9 Q.2) Write a Java program to create a class MyDate with data members dd,
// mm, and yy. Implement a default and parameterized constructors. Display
// the date in dd-mm-yy format using this keyword.

import java.util.*;

class MyDate {
    int dd, mm, yy;

    MyDate() {
        this.dd = 1;
        this.mm = 1;
        this.yy = 2000;
    }

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display() {
        System.out.printf("%02d-%02d-%02d\n", this.dd, this.mm, this.yy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyDate d1 = new MyDate();

        System.out.println("Default Date:");
        d1.display();

        System.out.print("Enter day: ");
        int dd = sc.nextInt();

        System.out.print("Enter month: ");
        int mm = sc.nextInt();

        System.out.print("Enter year: ");
        int yy = sc.nextInt();

        MyDate d2 = new MyDate(dd, mm, yy);

        System.out.println("Parameterized Date:");
        d2.display();

        sc.close();
    }
}
