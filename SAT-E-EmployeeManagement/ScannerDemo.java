import java.util.Scanner;

class ScannerDemo
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    System.out.println("You entered: " + num);

 System.out.print("Enter a float: ");
     float marks=sc.nextFloat();
    System.out.println("You floatentered: " + marks);

     System.out.print("Enter a double: ");
     double a=sc.nextDouble();
    System.out.println("You double entered: " + a);

     System.out.print("Enter your SENTENCE: ");
     char letter=sc.next().charAt(0);
    System.out.println("Your char entered: " + letter);

     System.out.print("Enter a BOOLEAN: ");
     boolean Sa=sc.nextBoolean();
    System.out.println("You entered: " + Sa);

    System.out.print("Enter your SENTENCE: ");
    String name=sc.nextLine();
    System.out.println("Your sentence entered: " + name);
 
    sc.nextLine();   // to avoid break from string

// Enter a number: 2
// You entered: 2
// Enter a float: 2.3
// You entered: 2.3
// Enter a double: 2333345
// You entered: 2333345.0
// Enter a BOOLEAN: TRUE
// You entered: true

}
}
