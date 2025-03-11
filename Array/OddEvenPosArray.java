import java.util.*;
public class OddEvenPosArray
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("Enter the number of elements");
	    n=sc.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Enter the elements");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    System.out.println("Elements at odd Position");
        for(int i=0;i<n;i++)
	    {
	        if(i%2==0)
	        {System.out.print(arr[i]+" ");}
	    }
	    System.out.println("\nElements at even Position");
	    for(int i=0;i<n;i++)
	    {
	        if(i%2!=0)
	        {System.out.print(arr[i]+" ");}
	    }
	}
}
