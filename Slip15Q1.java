
// Q.1) Write a Java program to reverse a number.
// Accept the number using command line arguments.

class Slip15Q1 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse Number: " + reverse);
    }
}
