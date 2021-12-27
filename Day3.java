PROGRAM:1

import java.util.*;
import java.io.*;
class DataTypes
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int i=0;i<t;i++)
   {
     try
      {
        long x=sc.nextLong();
        System.out.println(x+" can be fitted in: ");
        if(x>=-128 && x<=127)
        System.out.println("byte");
        else if(x>=-32768 && x<=32767)
        System.out.println("short");
        else if(x>=-2147483648 && x<=2147483647)
        System.out.println("int");
        else if(x>=-9223372036854775808L && x<=9223372036854775807L)
        System.out.println("long");
       }
       catch(Exception e)
       {
         System.out.println(sc.next()+" can't be fitted anywhere.");
       }
    }
  }
}

OUTPUT:
5
-150 150000 150000000 15000000000000 150000000000000000000000
-150 can be fitted in:
short
150000 can be fitted in:
int
150000000 can be fitted in:
int
15000000000000 can be fitted in:
long
150000000000000000000000 can't be fitted anywhere.
----------------------------------------------------------------------------------------------
PROGRAM:2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class EndOfFile
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no of lines");
  int n=sc.nextInt();
  try
  {
   for(int i=1;i<=n;i++)
    {
      Scanner s=new Scanner(System.in);
      String line=s.nextLine();
      System.out.println(i+" "+line);
    }
  }
  catch(Exception e)
  {
   System.out.println("Invalid Input");
  }
 }
}

OUTPUT:
enter no of lines
3
Hello World
1 Hello World
I am a file
2 I am a file
Read me until end of file
3 Read me until end of file
-----------------------------------------------------------------------------------------
PROGRAM:3

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Parallelogram
{
 static int breadth,height;
 static
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter breadth and height");
  breadth=sc.nextInt();
  height=sc.nextInt();
 }
  public static void main(String args[])
  {
   if(breadth<=100 && height<=100)
   {
    int area=breadth*height;
    System.out.println("Area of parallelogram:"+area);
   }
    else if(breadth>101 && height>101)
    System.out.println("out of range");
    else
    System.out.println("java.lang.Exception:breadth and height must be positive");
  }
}

OUTPUT:
Enter breadth and height
18 30
Area of parallelogram:540
-----------------------------------------------------------------------------------------------
PROGRAM:4

import java.util.*;
import java.io.*;
public class IntString
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a value");
 int n=sc.nextInt();
 String s=Integer.toString(n);
 if(n>=-100 && n<=100)
 {
   if(s.equals(Integer.toString(n)))
   {
    System.out.println("Good job");
   }
 }
  else
  {
   System.out.println("Wrong answer");
  }
 }
}

OUTPUT:1
enter a value
69
Good job

OUTPUT:2
enter a value
576
Wrong answer

---------------------------------------------------------------------------------------------
PROGRAM:5

import java.util.*;
import java.text.*;
public class Currency
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  double payment=sc.nextDouble();
  sc.close();
  String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
  String india=NumberFormat.getCurrencyInstance(new Locale("en")).format(payment);
  String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
  String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
  System.out.println("US: " + us);
  System.out.println("INDIA: " + india);
  System.out.println("CHINA: " + china);
  System.out.println("FRANCE: " + france);
 }
}

OUTPUT:
12324.134
US: $12,324.13
INDIA: ¤12,324.13
CHINA: ¥12,324.13
FRANCE: 12?324,13 ?


