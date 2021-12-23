PROGRAM:1
 
import java.util.Scanner;
public class Pattern1
{
  public static void main(String args[])
  {
   int n=5,num;
    for(int i=0;i<n;i++)
   {
    num=1;
    for(int j=0;j<=i;j++)
    {
     System.out.print(num+ " ");
     num++;
    }
     System.out.println();
   }
  }
}
 
OUTPUT:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
---------------------------------------------------------------------------------------
PROGRAM:2

import java.util.*;
public class Pattern2
{
 public static void main(String args[])
 {
  int n=5;
  for(int i=n;i>=1;i--)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(j+ " ");
    
   }
    System.out.println();
   }
  }
}

OUTPUT:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
-------------------------------------------------------------------------------------------
PROGRAM:3

import java.util.*;
public class Pattern3
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int rows=sc.nextInt();
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=i;j++)
    {
     if(j==1 || j==i || i==rows)
     System.out.print(" "+j);
     else
     System.out.print("  ");
    }
   System.out.println();
   }
  }
}

OUTPUT:
5
 1
 1 2
 1   3
 1     4
 1 2 3 4 5
------------------------------------------------------------------------------------------
PROGRAM:4