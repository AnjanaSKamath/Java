import java.util.*;
public class OddOrEven{
   public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println(args[0]+"Enter the number\n");
    n=sc.nextInt();
    if(n%2==0){
         System.out.println(n + "is an even number");
    }
    else{
        System.out.println(n + "is an odd number");
    }
}
}