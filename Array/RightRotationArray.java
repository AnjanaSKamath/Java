import java.util.*;
public class RightRotationArray
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rotations:");
	int r=sc.nextInt();
	System.out.println("Enter the number of elements:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	System.out.println("Original array is");
	for(int i=0;i<n;i++)
	{
	    System.out.print(arr[i]+" ");
	}
	
	for(int i=0;i<r;i++)
	{
	    int last=arr[n-1];
	    for(int j=n-2;j>=0;j--)
	    {
	        arr[j+1]=arr[j];
	    }
	    arr[0]=last;
	}
	System.out.println("\nNew array is");
	for(int i=0;i<n;i++)
	{
	    System.out.print(arr[i]+" ");
	}
	
	}
}
