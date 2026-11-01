import java.util.Scanner;
import java.util.Arrays;

public class Slip2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Citys[] = new String[5];
        System.out.println("Enter City Names :");

        for(int i = 0; i < 5; i++) {
            Citys[i] = sc.nextLine();
        }

        Arrays.sort(Citys);

        System.out.println("Cities In Descending Order :");

        for(int i = 4; i >= 0; i--) {
            System.out.println(Citys[i]);
        }
        sc.close();
    }
}
