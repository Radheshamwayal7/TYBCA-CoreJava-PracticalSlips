
// Q.1) Write a java program to accept names of ‘n’ cities, insert same into
// array list collection and display the contents of same array list,
// also remove all these elements.

import java.util.*;

class Slip14Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> city = new ArrayList<>();

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            city.add(sc.nextLine());
        }

        System.out.println("Cities: " + city);

        city.clear();

        System.out.println("After Removing: " + city);

        sc.close();
    }
}
