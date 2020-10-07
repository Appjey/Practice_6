package Ex_2;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student("Alex", "london", 4));
        ar.add(new Student("Sasha", "nyc", 7));
        ar.add(new Student("shit", "jaipur", 1));

        //Sorts the specified list according to the order induced by the specified comparator
        Collections.sort(ar, new SortingStudentsByGPA());

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}
