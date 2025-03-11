import java.util.*;
public class LargestSmallestArray

{
	public static void main(String[] args) {
	System.out.println("Enter the number of elements:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	int max=arr[0],min=arr[0];
	for(int i=0;i<n;i++)
	{
	    if(arr[i]>max)
	    {
	        max=arr[i];
	    }
	    if(arr[i]<min){
	        min=arr[i];
	    }
	}
	System.out.println(max+" is the largest");
	System.out.println(min+" is the smallest");
	}
}
