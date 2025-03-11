/*
Java program to print the following pattern on the console
12344321
123**321
12****21
1******1
*/

import java.util.*;
public class Pattern5
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("Enter the number of rows");
	    n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=n;j++)
	        {
	            if(j<=n-i+1)
	            {
	                System.out.print(j);
	            }
	            else{
	                System.out.print("*");
	            }
	        }
	        for(int j=(n+1);j<=(2*n);j++)
	        {
	            if(j>=n+i)
	            {
	                System.out.print((2*n)+1-j);
	            }
	            else
	            {
	                System.out.print("*");
	            }
	        }
	        System.out.println();
	    }
	}
}
