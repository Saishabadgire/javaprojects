class test 
{

    int x=5;
    int y=10;

    void demo(int x,int y)
    {
int sum=this.x+x;
 System.out.println("sum" + sum);
    }
}


public class ThisMetho 
{
    public static void main(String[] args) 
    {
        test t = new test();
        t.demo(10,20);

    }
    
}
