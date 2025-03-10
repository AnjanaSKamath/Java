import java.util.*;
public class LeftRotationArray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of rotations");
	    int r=sc.nextInt();
	    System.out.println("Enter the number of elements : ");
	    int n=sc.nextInt();
	    int [] arr=new int[n];
	    System.out.println("Enter the elements");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    System.out.println("Original Array is");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
		for(int i=0;i<r;i++){
		    int first,j;
		    first=arr[0];
		    for(j=0;j<n-1;j++){
		        arr[j]=arr[j+1];
		    }
		    arr[j]=first;
		}   
		System.out.println("\nThe new array is");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}
