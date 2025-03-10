import java.util.*;
public class FrequencyOfArray
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements");
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    int[] fr=new int[n];
	    int count,visited=-1;
	    System.out.println("Enter the array elements");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        count=1;
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
	    System.out.println("Element  |  Frequency");
	    for(int j=0;j<n;j++)
	    {
	            if(fr[j]!=visited){
	                System.out.println(arr[j]+"  |  "+fr[j]);
	            }
	        }
	    
	}
}
