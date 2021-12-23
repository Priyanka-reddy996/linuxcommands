PROGRAM:1

import java.util.*;
import java.io.*;
public class JavaString
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string:");
  String A=sc.next();
  String B=sc.next();
  System.out.println(A.length()+B.length());
  int c=A.compareTo(B);
  if(c<0)
  {
   System.out.println("No");
  }
  else
  {
   System.out.println("Yes");
  }
   System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
   System.out.println(B.substring(0,1).toUpperCase()+B.substring(1));
 }
}

OUTPUT:
Enter the string:
hello
priyareddy
15
No
Hello Priyareddy
----------------------------------------------------------------------------------------------------------------------------------

PROGRAM:2

import java.util.*;
import java.io.*;
public class SubString
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the string:");
  String s1=sc.next();
  int startindex=sc.nextInt();
  int endindex=sc.nextInt();
  System.out.println(s1.substring(startindex,endindex));
 }
}

OUTPUT:
Enter the string:
helloworld
3 7
lowo
-----------------------------------------------------------------------------------------------------------------------------------------------------------
PROGRAM:3

import java.util.*;
import java.io.*;
public class Anagram
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String a=sc.next();
  String b=sc.next();
  int a1=a.length();
  int b1=b.length();
  if(a1==b1)
  {
   char[] s1=a.toCharArray();
   Arrays.sort(s1);
   String sort1=new String(s1);
   char[] s2=b.toCharArray();
   Arrays.sort(s2);
   String sort2=new String(s2);
   if(sort1.equalsIgnoreCase(sort2))
   System.out.println("Anagrams");
   else
   System.out.println("NOT Anagrams");
  }
 }
}

OUTPUT:

anagram
margana
Anagrams
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
PROGRAM:4

import java.util.*;
import java.io.*;
public class Palindrome
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String s=sc.nextLine();
  String rs="";
  int length=s.length();
  for(int i=length-1;i>=0;i--)
  {
   rs=rs+s.charAt(i);
  }
  if(s.equalsIgnoreCase(rs))
  System.out.println(s+ "is a palindrome");
  else
  System.out.println(s+ "is not a palindrome");
 }
}

OUTPUT:1

Enter a string:
madam
madamis a palindrome

OUTPUT:2

Enter a string:
priya
priyais not a palindrome
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
PROGRAM:5

import java.util.*;
import java.io.*;
public class PrimeNumber
{
 public static void main(String args[])
 {
  int f=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  if(n==0 || n==1)
  {
   System.out.println(n+" is not a prime number");
  }
  else
  {
   for(int i=2;i<n/2;i++)
   {
    if(n%i==0)
    {
     f=1;
     break;
    }
   }
    if(f!==0)
    System.out.println(n + "is not a prime number");
    else
    System.out.println(n + "is  a prime number");
  }
 }
}

OUTPUT:
Enter a number:
23
23is  a prime number
