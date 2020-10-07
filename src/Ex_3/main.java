package Ex_3;

import Ex_3.SortingStudentsByGPA;
import Ex_3.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Ex_3.Student> ar = new ArrayList<>();
        ar.add(new Ex_3.Student("Alex", "london", 4));
        ar.add(new Ex_3.Student("Sasha", "nyc", 7));
        ar.add(new Ex_3.Student("shit", "jaipur", 1));

        ArrayList<Ex_3.Student> ar2 = new ArrayList<>();
        ar2.add(new Ex_3.Student("Alex2", "london2", 4));
        ar2.add(new Ex_3.Student("Sasha2", "nyc2", 7));
        ar2.add(new Ex_3.Student("shit2", "jaipur2", 1));

        for (int i = 0; i < ar2.size(); i++) {
            ar.add(ar2.get(i));
        }

        Collections.sort(ar, new SortingStudentsByGPA());

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}