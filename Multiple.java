import java.util.Scanner;
public class Multiple
{
 public static void main(String args[])
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any number:");
  int m=sc.nextInt();
  for(int i=1;i<=10;i++)
  {
    n=m*i;
    System.out.println("5*"+i+"="+n);
  }
 }
}