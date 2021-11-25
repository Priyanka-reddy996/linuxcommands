import java.util.Scanner;
public class StdInOut
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Scanner s=new Scanner(System.in);
 System.out.println("Enter values:");
 int x=sc.nextInt();
 double y=sc.nextDouble();
 String z=s.nextLine();
 
 System.out.println("String:"+z);
 System.out.println("Double:"+y);
 System.out.println("Integer:"+x);
}
}