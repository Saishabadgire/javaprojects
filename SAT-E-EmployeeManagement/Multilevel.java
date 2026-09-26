
class Vehicle {
Vehicle()
{
     System.out.println("Vehicle CONSTRUCTOR");
}

       void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    Car()
    {
        super();
          System.out.println("Car CONSTRUCTOR");
    }
    void drive() {
        System.out.println("Car is driving");
    }

     void speed() {
        System.out.println("car run fast");
    }
}

class SportsCar extends Car
 {   

    SportsCar()
    {
        super();
       System.out.println("SportsCar CONSTRUCTOR");
    }

    @Override
    void speed() {
         super.speed();
        System.out.println("Sports car runs fast");
    }
}

public class Multilevel {

     public static void main(String[] args) {
        SportsCar s1 = new SportsCar();

        s1.start(); 
        s1.drive();  
        s1.speed();  
     }
}
