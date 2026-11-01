
// Q.2) Write a java program to accept ‘N’ student names through command
// line, store them into the appropriate Collection and display them by
// using Iterator and ListIterator interface.

import java.util.*;

class Slip24Q2 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            students.add(args[i]);
        }

        System.out.println("Student Names Using Iterator:");

        Iterator<String> itr = students.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Student Names Using ListIterator:");

        ListIterator<String> litr = students.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        
    }
}
