//Program to count number of characters in a String

import java.util.*;
public class CharacterCount
{
	public static void main(String[] args) {
	    int count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println(Enter the String);
	    String str=sc.nextLine();
	    for(int i=0;istr.length();i++)
	    {
	        if(str.charAt(i)!=' '){
	            count++;
	        }
	    }
		System.out.println(str+" has "+count+" characters\n");
	}
}