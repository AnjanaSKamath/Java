import java.util.*;
public class Pattern1
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements");
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Enter the array elements");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(i==(n-j-1)){
	                System.out.print("*");
	            }
	            else{
	                System.out.print(arr[j]);
	            }
	        }
	        System.out.println();
	    }
	 
	    
	}
}