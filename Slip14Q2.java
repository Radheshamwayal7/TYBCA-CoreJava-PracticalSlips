
// Q.2) Write a program to read the contents of “abc.txt” file,
// Display the contents of file in uppercase as output.

import java.io.*;

class Slip14Q2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new FileReader("abc.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line.toUpperCase());
        }

        br.close();
    }
}
