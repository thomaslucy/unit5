// *
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// *
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mark");
        Student student2 = new Student("Gert");

        student1.inputGrades();
        System.out.println(student1);
        System.out.println(student1.getAverage());

        System.out.println();

        student2.inputGrades();
        System.out.println(student2);
        System.out.println(student2.getAverage());

    }

    public String toString(){
        return 
    }
}

