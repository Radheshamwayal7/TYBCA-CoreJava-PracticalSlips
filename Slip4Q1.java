 
//(Q.1) Write a java program to check whether a given number is Positive or negative. 

import java.util.Scanner;

public class Slip4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("The Number Is Positive .");
        }
        else {
            System.out.println("The Number is Negative.");
        }
        sc.close();
    }
}
