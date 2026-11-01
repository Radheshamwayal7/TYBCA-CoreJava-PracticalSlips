
// Q.1) Write a Java program to accept a number from user and print all prime
// numbers upto that number (Use BufferedReader class)

import java.io.*;

class Slip11Q1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
