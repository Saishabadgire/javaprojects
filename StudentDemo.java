import java.util.Scanner;


class Student
{

    private int marks; 
    
    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}

public class StudentDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter marks: ");
        Student student = new Student();
       
        student.setMarks(sc.nextInt());
        System.out.println("Marks: " + student.getMarks());
    }
}