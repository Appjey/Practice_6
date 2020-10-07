package Ex_2;

import java.util.*;

class SortingStudentsByGPA implements Comparator<Student> {

    /*
    *   Compares rank property of two Student class objects and returns difference
    *
    *   Parameters: a - first object (Student)
    *               b - second object (Student)
    *
    *   Return: int
    */
    public int compare(Student a, Student b)
    {
        return b.Rank - a.Rank;
    }
}

