<<<<<<< HEAD
 PROGRAM:1
=======
PROGRAM:1
>>>>>>> abd36fe58d8ce32708946f9e2a7a3e0db7bb2366

import java.util.*;
public class Pattern91
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no.of rows and columns:");
  int rows=sc.nextInt();
  int columns=sc.nextInt();
  for(int i=1;i<=rows;i++)
  {
   for(int j=1;j<=columns;j++)
   {
    System.out.print("* ");
   }
      System.out.print("\n");
   }
<<<<<<< HEAD
  }
=======
    
  
 }
>>>>>>> abd36fe58d8ce32708946f9e2a7a3e0db7bb2366
}

OUTPUT:
Enter the no.of rows and columns:
3 5
* * * * *
* * * * *
* * * * *
--------------------------------------------------------------------------------------------
<<<<<<< HEAD
 PROGRAM:2
=======
PROGRAM:2
>>>>>>> abd36fe58d8ce32708946f9e2a7a3e0db7bb2366

import java.util.Scanner;

public class HallowRectangle1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Rectangle Rows & Columns = ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		System.out.println("Printing Hollow Rectangle Star Pattern");
		
		for (int i = 0; i < rows; i++ ) 
		{
			for (int j = 0 ; j < columns; j++ ) 
			{
				if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

OUTPUT:
Enter Hollow Rectangle Rows & Columns = 3 5
Printing Hollow Rectangle Star Pattern
*****
*   *
*****
------------------------------------------------------------------------------------------
PROGRAM:3

import java.util.Scanner;
public class SolidDiamond
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int space=n-1;
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<space;j++)
   {
    System.out.print(" ");
   }
    for(int j=0;j<=i;j++)
    {
     System.out.print("* ");
    }
   System.out.println();
   space--;
  }
  space=1;
  for(int i=n;i>0;i--)
  {
   for(int j=1;j<space;j++)
   {
    System.out.print(" ");
   }
     space++;
     for(int j=0;j<i;j++)
    {
     System.out.print("* ");
    }
   
   System.out.println( );
   
  }
 }
}

OUTPUT:
5
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
--------------------------------------------------------------------------------------------
<<<<<<< HEAD
PROGRAM:4

import java.util.*;
public class HollowDiamond
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int rows=sc.nextInt();
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=rows-i;j++)
     {
      System.out.print(" ");
     }
    for(int k=1;k<=i*2-1;k++)
    {
     if(k==1 || k==i*2-1)
     { 
     System.out.print("*");
     }
     else
     {
     System.out.print(" ");
     }
    }
   System.out.println();
   }
   for(int i=rows-1;i>0;i--)
   {
    for(int j=1;j<=rows-i;j++)
     {
      System.out.print(" ");
     }
    for(int k=1;k<=i*2-1;k++)
    {
     if(k==1 || k==i*2-1)
     {
     System.out.print("*");
     }
     else
     {
     System.out.print(" ");
     }
    }
   System.out.println();
  }
 }
}

OUTPUT:
5
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
-----------------------------------------------------------------------------------------------
PROGRAM5:

import java.util.*;
public class HalfDiamond
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int rows=sc.nextInt();
   for(int i=0;i<=rows;i++)
   {
    for(int j=0;j<=i;j++)
    {
     System.out.print("*"+" ");
    }
   System.out.println(" ");
   }
   for(int i=rows;i>=0;i--)
   {
    for(int j=0;j<=i-1;j++)
    {
     System.out.print("*"+" ");
    }
   System.out.println(" ");
  }
 }
}

OUTPUT:
-------------------------
5
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
=======
PROGRAM:4
>>>>>>> abd36fe58d8ce32708946f9e2a7a3e0db7bb2366
