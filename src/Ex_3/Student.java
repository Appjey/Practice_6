package Ex_3;

public class Student {
    private final String Name;
    private final String SecondName;
    public final int Rank;

    /*
    *   Constructs student, sets his name and second name. Converts int values of name and second name to its string representation
    *
    *   Parameters: Name - student name (String)
    *               SecondName - student second name (String)
    */
    public Student(String Name, String SecondName, int Rank) {
        this.Name = String.valueOf(Name); //Returns the string representation of the int argument
        this.SecondName = String.valueOf(SecondName);
        this.Rank = Rank;
    }

    /*
     *   Returns string representation of this object
     *
     *   Parameters: no
     *
     *   Return: String
     */
    public String toString() {
        return "Name = " + this.Name + " Second Name = " + this.SecondName + " Rank = " + this.Rank;
    }
}

