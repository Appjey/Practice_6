package Ex_1;

public class Student {
    private final String Name;
    private final String SecondName;

    /*
    *   Constructs student, sets his name and second name. Converts int values of name and second name to its string representation
    *
    *   Parameters: Name - student name (int)
    *               SecondName - student second name (int)
    */
    public Student(int Name, int SecondName) {
        this.Name = String.valueOf(Name); //Returns the string representation of the int argument
        this.SecondName = String.valueOf(SecondName);
    }

    public String toString() {
        return "Name = " + this.Name + " Second Name = " + this.SecondName;
    }
}

