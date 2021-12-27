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
------------------------------------------------------------------------------------------
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
--------------------------------------------------------------------------------------------
PROGRAM:3
import java.util.Scanner;
 
public class Pattern3
{            
    public static void main(String[] args)    
    {
          
        int n = 5;
  
        for (int i = 0; i < n; i++)
        {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) 
            {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
  
    }
  
}
OUTPUT:
             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
---------------------------------------------------------------------------------------------------------
PROGRAM:4
import java.util.Scanner;
public class Pattern4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int rows = sc.nextInt();        
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) 
            { 
              System.out.print("*"+ " "); 
            } 
              System.out.println(""); 
        } 
          for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
OUTPUT:
Enter the number of rows:5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
----------------------------------------------------------------------------------------------------------------------------------
PROGRAM:5

import java.util.Scanner;
  
public class Pattern5
{            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows: ");    
        int rows = sc.nextInt();         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
               
            System.out.println();
        }         
        sc.close();
    }
}

OUTPUT:

Enter the number of rows: 5

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
----------------------------------------------------------------------------------------------
PROGRAM:6

import java.util.Scanner;
 
public class Pattern6
{
   public static void main(String[] args)
   {
     for (int i = 5; i >= 0; i--)
     {
       int alphabet = 65;
       for (int j = 0; j <= i; j++)
       {
         System.out.print((char) (alphabet + j) + " ");
       }
         System.out.println();
     }
      for (int i = 0; i<= 5; i++)
     {
      int alphabet = 65;
      for (int j = 0; j <= i; j++)
      {
         System.out.print((char) (alphabet + j) + " ");
      }
        System.out.println();
     }
   }
}
 
OUTPUT:
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
-------------------------------------------------------------------------------------------------------------------
PROGRAM:7

import java.util.*;
public class Pattern7
{
    public static void main(String[] args)
    {
        
        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--)
        {
            int alphabet = 65;
            for (int j = 0; j <= i - 1; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}

Output:
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A
-----------------------------------------------------------------------------------------------------
PROGRAM:8

import java.util.*;
public class Pattern8
{
    public static void main(String[] args)
    {
           for (int i = 5; i >= 0; i--)
        {
            int alphabet = 65;
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = i; j >= 0; j--)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
Output:

F E D C B A 
E D C B A 
D C B A 
C B A 
B A 
A 
A 
B A 
C B A 
D C B A 
E D C B A 
F E D C B A
--------------------------------------------------------------------------------------------------------------------
PROGRAM:9

import java.util.*;
public class Pattern9
{
    public static void main(String[] args)
    {
        int alphabet = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}

Output:

F E D C B A 
F E D C B 
F E D C 
F E D 
F E 
F 
--------------------------------------------------------------------------------------------------------------------------------
PROGRAM:10

import java.util.*;
public class Pattern10
{
    public static void main(String[] args)
    {
      
        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}

Output:

     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F
---------------------------------------------------------------------------------------------------------
PROGRAM:11

import java.util.*;
public class Pattern11
{
    public static void main(String[] args)
    {
        int alphabet = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}

Output:

A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U
--------------------------------------------------------------------------------------------------------------
PROGRAM:12

import java.util.*;
public class Pattern12
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 6; i++)
        {
            int alphabet = 65;
            for (int j = 6; j > i; j--)
            {
                System.out.print(" ");
            }

            int temp = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print((char) (alphabet - 1 + temp) + " ");
                temp = temp * (i - k) / (k);
            }
            System.out.println();
        }
    }
}

Output:

     A 
    A A 
   A B A 
  A C C A 
 A D F D A 
A E J J E A
---------------------------------------------------------------------------------------------------------------------------
PROGRAM:13

import java.util.*;
public class Pattern13
{
    public static void main(String[] args)
    {

       for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = 0; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= 5 - i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}

Output:

 A B C D E F 
  A B C D E 
   A B C D 
    A B C 
     A B 
      A
------------------------------------------------------------------------------------------------------------------------
PROGRAM:14

import java.util.Scanner;

public class Pattern14
{
  public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
         
        int noOfRows = sc.nextInt();

        for (int i = 1; i <= noOfRows; i++) 
        {
           for (int j = 1; j <= i; j++)
          {
             System.out.print(i+" ");
          }
               
          System.out.println();
         }
    }
}

OUTPUT:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 
6 6 6 6 6 6
7 7 7 7 7 7 7
-------------------------------------------------------------------------------------------------------------------------
PROGRAM:15
import java.util.Scanner;

public class Pattern15
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();

        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

Output:

Enter the number of rows to print the pattern 
5

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 