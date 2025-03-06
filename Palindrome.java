import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str,rev="";
        System.out.println("Enter the string");
        str=sc.next();
        int m=str.length();
        for(int i=m-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev))
        {
            System.out.println(str+" "+"is a palindrome");
        }
        else
        {
            System.out.println(str+" "+"is not a palindrome");
        
        }
    }
}