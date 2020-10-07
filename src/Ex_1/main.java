package Ex_1;

public class main {
    public static void main(String[] args) {
        int[] iDNumber = {10, 2, 10, 3, 1, 2, 5};
        sort s = new sort();
        s.SortTheArrayWithInserts(iDNumber);

        Student[] st = new Student[6];
        for (int i = 0; i < 5; i++) {
            st[i] = new Student(i, i);
            System.out.println(st[i].toString());
        }
    }
}