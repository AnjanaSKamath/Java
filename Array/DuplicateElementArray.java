import java.util.*;
public class DuplicateElementArray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements : ");
	    int n=sc.nextInt();
	    int [] arr=new int[n];
	    int [] fr=new int[n];
	    int visited=-1;
	    System.out.println("Enter the elements");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        int count=0;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]==arr[j]){
	                count++;
	                fr[j]=visited;
	            }
	        }
	        if(fr[i]!=visited)
	        {
	            fr[i]=count;
	        }
	    }
	    System.out.println("Duplicate elements are");
	    for(int i =0;i<n;i++)
	    {
	        if(fr[i]>=2)
	        {
	            System.out.println( arr[i]+" ");
	        }
	    }
	}
}