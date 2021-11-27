import java.util.*;
import java.io.*;
class Solution
{
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter values:");
  int t=in.nextInt();
  for(int i=0;i<t;i++)
  {
   int a=in.nextInt();
   int b=in.nextInt();
   int n=in.nextInt();
   int s=a+b;
   System.out.print(s+" ");
    for(int j=1;j<n;j++)
   {
    s+=((int)Math.pow(2,j))*b;
    System.out.print(s+" ");
   }
    System.out.println();
  }
   in.close();
 }
}

OUTPUT:1
Enter values:
2
5 3 5
8 14 26 50 98

OUTPUT:2
Enter values:
2
0 2 10
2 6 14 30 62 126 254 510 1022 2046



