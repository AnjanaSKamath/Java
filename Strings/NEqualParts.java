/*Program to divide a string in 'N' equal parts.*/

import java.util.*;
public class NEqualParts
{
	public static void main(String[] args) {
	    int count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String");
	    String str=sc.nextLine();
	    System.out.println("Enter the number of parts");
	    int n=sc.nextInt();
	    int d=str.length()/n;
	    if (str.length() % n == 0) {
            char[] arr = new char[d];
            System.out.println("The divided parts are:");
            int index = 0;
            for (int i=0;i<n;i++) {
                for (int j=0;j<d;j++) {
                    arr[j] = str.charAt(index++);
                }
                System.out.println(new String(arr));
            }
        }
	    else{
	        System.out.println(str+" cannot be divisible into "+n+" equal parts");
	    }
	}
}