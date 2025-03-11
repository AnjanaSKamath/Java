import java.util.*;
public class Pattern4
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("Enter the number of rows");
	    n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<=n/2;j++)
	        {
	            if((i==j) || ((i>=4)&&(j==(n-i-1))))
	            {
	                System.out.print(j+1);
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        
	        for(int j=(n/2)+1;j<n;j++)
	        {
	            if(j==n-i-1)
	            {
	                System.out.print(i+1);
	            }
	            else if(i==j)
	            {
	                System.out.print(n-i);
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
