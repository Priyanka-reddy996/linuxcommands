PROGRAM:1

import java.util.*;
public class Program1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.println("Fibonacci series of "+N+ "terms:");
        for(int i=2;i<N;i++)
        {
            n3=n1+n2;
            System.out.print(n1+" ");
            n1=n2;
            n2=n3;
           
        }
    }
}
OUTPUT:
10
Fibonacci series of 10terms:
0 1 1 2 3 5 8 13
---------------------------------------------------------------------------------------------
PROGRAM:2

import java.util.*;
class Prime
{
	public static void main(String arg[])	
	{
	int i,count;
               System.out.print("Enter n value : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
               System.out.println("Prime numbers between 1 to "+n+" are ");
	for(int j=2;j<=n;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(j+"  ");     
	}
	}
}

OUTPUT:
Enter n value : 100
Prime numbers between 1 to 100 are
2  3  5  7  11  13  17  19  23  29  31  37  41  43  47  53  59  61  67  71  73  79  83  89  97
