 
//(Q.2) Write a Java program to create a class Customer with data members cid, 
  //       cname, and billAmount. Create an array of ‘n’ customers and sort them 
    //     based on bill amount in ascending order.  

import java.util.*;

class Customer {
    int cid;
    String cname;
    double billAmount;

    void accept(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        cid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        cname = sc.nextLine();

        System.out.print("Enter Bill Amount: ");
        billAmount = sc.nextDouble();
    }

    void display() {
        System.out.println(cid + "  " + cname + "  " + billAmount);
    }
}

class Slip8Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();

        Customer c[] = new Customer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Customer " + (i + 1));
            c[i] = new Customer();
            c[i].accept(sc);
        }

        // Sort by bill amount in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (c[j].billAmount > c[j + 1].billAmount) {
                    Customer temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        System.out.println("\nCustomers in Ascending Bill Amount:");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }

        sc.close();
    }
}
