import java.util.Scanner;
public class Conditional
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number");
  int n=sc.nextInt();
  if(n%2==0)
  {
   if(n<=2 && n<=5)
   {
    System.out.println("Not weird");
   }
   else if(n<=6 && n<=20)
   {
    System.out.println("Weird");
   }
   else
   {
    System.out.println("Not weird");
   }
  }
  else
   {
    System.out.println("Weird");
   }
 }
}

     