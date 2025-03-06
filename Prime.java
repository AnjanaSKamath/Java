import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        boolean flag=false;
        System.out.println("Enter the number");
        n=sc.nextInt();
        if(n==1 || n==0)
        {
            System.out.println("Neither prime nor composite");
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n+" "+"is not a prime number");
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(n+" "+"is a prime number");
            }
        
            }
        }
        
    
}