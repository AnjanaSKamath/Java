import java.util.*;
import java.util.Arrays;  
public class ReverseArray{  
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed Array is");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            
        }
        
    }
}