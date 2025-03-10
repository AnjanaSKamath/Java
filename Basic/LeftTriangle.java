import java.util.*;
public class LeftTriangle
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of rows");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n-i-1;j++)
	        {
	            System.out.print(" ");
	        }
	        for(int j=n-1;j>=n-i-1;j--)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}