import com.sate.basic.Pack1;
class Person 
{
    String name= "SAISHA";
    int Age=20;
    void walk()
    {
        System.out.println("walking");    
    }

     void eat()
    {
        System.out.println("eating");    
    }
}

class Student extends Person 
{
    void study()
    {
        System.out.println("studying");    
    }
}

public class  Inheritance 
{
    public static void main(String[] args) 
    {

           
        Pack1 obj = new Pack1();
        obj.Pack1Method();
    
         Person p1=new Person();
         p1.walk();
         p1.eat();

        Student s1= new Student();
        s1.walk();
        s1.eat();
        s1.study();

        Person p2=new Student();
        p2.walk();
        p2.eat();
       // p2.study();
    }
}