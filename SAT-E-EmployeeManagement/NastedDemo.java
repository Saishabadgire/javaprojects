

// class Outer
// {
//     class Inner
//     {
//         void display()
//         {
//             System.out.println("This is an inner class");
//         }

//     }
// }



class Student                       // member inner class
{
    String name="saisha";
    int age=20;

    class Address
    {
        String city="pune";
        void display()
        {
            System.out.println("Student Name: " + name);
            System.out.println("City: " + city);
        }
    }

     void show()
        {
            System.out.println("Student Age: " + age);
        }
}



class College              // local inner class
 {
    private String collegeName = "sandipani";

    public void conductAdmission(String studentName) {
    
        class AdmissionProcess {
            void verifyAndEnroll() {
                System.out.println("Processing enrollment at: " + collegeName);
                System.out.println("Student " + studentName + " has been successfully verified and enrolled!");
            }
        }
        AdmissionProcess process = new AdmissionProcess();
        process.verifyAndEnroll();
    }
}

abstract class Animal               // anonymous inner class
{               
   abstract void sound();
 }



public class NastedDemo {
    public static void main(String[] args) {

        // Outer outer = new Outer();
        // Outer.Inner inner = outer.new Inner();
        // inner.display();

Student student = new Student();
student.show();
Student.Address address = student.new Address();
address.display();

 College myCollege = new College();
  myCollege.conductAdmission("saisha");


    Animal myAnimal = new Animal() {
        @Override
        void sound() {
            System.out.println("The animal makes a sound.");
        }

    };
             myAnimal.sound();
 }
}


// output
// Student Age: 20
// Student Name: saisha
// City: pune
// Processing enrollment at: sandipani
// Student saisha has been successfully verified and enrolled!