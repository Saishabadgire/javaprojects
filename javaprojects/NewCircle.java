class Circle
{
public Circle()
{
    this(10);
    System.out.println("default");
}

public Circle(int a)
{
    this(a,100);
    System.out.println("para"  +a);
}

public Circle(int a,int b)
{
  
    System.out.println("para 2 "  +a + " " +b);
}

}

public class NewCircle
{

  Circle c1= new Circle();
 Circle c2= new Circle(200);

}