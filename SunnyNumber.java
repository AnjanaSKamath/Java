import java.util.*;
public class SunnyNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n=sc.nextInt();
	    int n1=n+1;
	    double sq=Math.sqrt(n1);
	    if((sq-Math.floor(sq))==0){
	       System.out.println(n+" is a sunny number");
	   }
	   else
	   {
	       System.out.println(n+" is not a sunny number");
	   }
	}
}