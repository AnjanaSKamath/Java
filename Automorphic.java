import java.util.*;
public class Automorphic
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n=sc.nextInt();
	    int temp,count=0,count1=0;
	    temp=n;
	    while(temp>0){
	        temp=temp/10;
	        count++;
	   }
	   int sq=n*n;
	   
	   int last = sq % (int) Math.pow(10, count);
	   if(last==n){
	       System.out.println(n+" is an Automorphic number");
	   }
	   else
	   {
	       System.out.println(n+" is not an Automorphic number");
	   }
	}
}
