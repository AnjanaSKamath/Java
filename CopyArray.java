import java.util.*;
public class CopyArray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number of elements : ");
	    int n=sc.nextInt();
	    int[] arr1=new int[n];
	    int[] arr2=new int[n];
	    System.out.println("Enter the array elements");
	    for(int i=0;i<n;i++)
	    {
	        arr1[i]=sc.nextInt();
	        arr2[i]=arr1[i];
	    }
	    System.out.println("Old Array elements:");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr1[i]);
	    }
	    System.out.println("\nNew Array elements:");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr2[i]);
	    }
	}
}
