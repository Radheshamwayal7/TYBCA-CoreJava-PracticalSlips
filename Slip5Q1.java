// Slip 5 (Q.1) Write a java program to display the contents of a file in reverse order. 

import java.io.*;

class Slip5Q1 {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("input.txt");

        StringBuilder s = new StringBuilder();

        int ch;

        while ((ch = fr.read()) != -1) {
            s.append((char) ch);
        }

        fr.close();

        System.out.println("Reverse File Contents:");
        System.out.println(s.reverse());
    }
}
