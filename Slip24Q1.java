
// Q.1) Write a java program to accept n names of cities from user
// and display them in descending order.

import java.util.*;

class Slip24Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>();

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            cities.add(sc.nextLine());
        }

        Collections.sort(cities, Collections.reverseOrder());

        System.out.println("Cities in Descending Order:");

        for (String city : cities) {
            System.out.println(city);
        }

        sc.close();
    }
}
