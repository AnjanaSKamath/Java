/*To check if a String is anagram*/

import java.util.*;
public class Anagram
{
	public static void main(String[] args) {
	    int count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first String");
	    String str1=sc.nextLine();
	    System.out.println("Enter second String");
	    String str2=sc.nextLine();
	    
	    str1=str1.toLowerCase();
	    str2=str2.toLowerCase();
	    
	    if(str1.length()!=str2.length()) {
	        System.out.println("Not Anagram!!");
	    }
	    else {
	        char [] array1=str1.toCharArray();
	        char [] array2=str2.toCharArray();
	        
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	        
	        if(Arrays.equals(array1,array2)==true){
	            System.out.println(str1+" and "+str2+" are anagrams");
	        }
	        else{
	            System.out.println("Not Anagram!!");
	        }
	        
	    }
	}
}
