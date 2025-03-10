import java.util.*;
public class Pattern2
{    
    public static void main(String[] args){    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=0;j<((2*n)+1);j++)
        {
            if(j<n)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else
                {
                   System.out.print("0");
                }
            }
            else if(j==n)
            {
                System.out.print("*");
            }
            else
            {
                if(j==((2*n)-i))
                {
                    System.out.print("*");
                }
                else
                {
                   System.out.print("0");
                }
            }
        }
        System.out.println();
        }
    }
} 