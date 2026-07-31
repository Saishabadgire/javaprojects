public class Rectangle
{
int length;
int breadth;

public Rectangle()
    {
        length=10;
        breadth=20;
    }


 public Rectangle(int length,int breadth)
 {
    this.length=length;
    this.breadth=breadth;
 }   

  public static void main(String[] args) 
  {
    Rectangle r1=new Rectangle();
     Rectangle r2=new Rectangle(1,2);
    System.out.println("default length "+ r1.length + "breadth" + r1.breadth);
     System.out.println("parameterized length "+ r2.length + "breadth" + r2.breadth);
  }
}
