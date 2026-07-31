class Calculator 
 {
  // void addition()         // method with no parameter and with return type
  // {
  //   int a=5;
  //   int b= 10;
  //   int c= 2;
  //   System.out.println(a+b+c);
  // }


//  void addition(int n1, int n2)      // method with parameter and return type 
//   {
//     int sum=n1+n2;
//     System.out.println(sum);
//   }
  
 int addition(int n1, int n2)      // method with parameter and return type 
  {
    int sum=n1+n2;
   return sum;
  }
  
// string addition(int x ,int y)
// {
// int n1=10;
// int n2=20;
// int sum=n1=n2;
// string s=null;
//  if (sum>10)
//  {
//   s="greater value";
//  }
//  else
//   {
//   s="Lesser value";
//   }
//  return s;
// }

  }

   public class CalculatorDemo {
   public static void main(String[] args) 
   {
    int num1=10;
    int num2=20;
    Calculator cal = new Calculator();


    // cal.addition();
    //cal.addition(10, 12);
     int sum = cal.addition(num1,num2);
     System.out.print(sum);
    //string.msg=cal.addition(num1,num2);
    // system.out.print(s);

   }
}
