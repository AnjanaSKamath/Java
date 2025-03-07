import java.util.*;
public class PetersonNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n=sc.nextInt();
	    int temp,fact,sum=0,rem;
	    temp=n;
	    while(temp>0){
	        rem=temp%10;
	        fact=1;
	        for(int i=1;i<=rem;i++)
	        {
	            fact=fact*i;
	        }
	        sum=sum+fact;
	        temp=temp/10;
	   }
	   if(sum==n){
	       System.out.println(n+" is an Peterson number");
	   }
	   else
	   {
	       System.out.println(n+" is not an Peterson number");
	   }
	}
}
