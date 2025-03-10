import java.util.*;
public class Amstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,temp,count=0,s=0,rem=0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp>0)
        {
            rem=temp%10;
            s=s+((int)Math.pow(rem,count));
            temp=temp/10;
        }
        if(n==s){
            System.out.println(n+" is an amstrong number");
        }
        else{
            System.out.println(n+" is not amstrong number");
        }
    }
}