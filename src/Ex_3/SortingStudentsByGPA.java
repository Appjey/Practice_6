package Ex_3;

import Ex_2.Student;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Ex_3.Student> {

    /*
    *   Compares rank property of two Student class objects and returns difference
    *
    *   Parameters: a - first object (Student)
    *               b - second object (Student)
    *
    *   Return: int
    */
    public int compare(Ex_3.Student a, Ex_3.Student b)
    {
        return b.Rank - a.Rank;
    }
}

