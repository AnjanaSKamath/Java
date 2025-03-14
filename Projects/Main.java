import java.util.*;
import static java.lang.System.exit;

interface CalculatorServices{
    double add(double a,double b);
    double sub(double a,double b);
    double mul(double a,double b);
    double div(double a,double b);
}

abstract class AbClass implements CalculatorServices{
    public double add(double a,double b)
    {
        return a+b;
    }
    public double sub(double a,double b)
    {
        return a-b;
    }
}

class CClass extends AbClass{
    public double mul(double a,double b){
        return a*b;
    }
    public double div(double a,double b){
        if (b==0){
            System.out.println("Division by zero is not possible");
            return 0;
        }
        else{
            return a/b;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        CClass obj=new CClass();
        Scanner sc=new Scanner(System.in);
        double a,b;
        int c;
        do{
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter the serial number of the operation to be performed: ");
            c=sc.nextInt();
            switch(c){
                case 1: System.out.println("Enter the 1st Number: ");
                        a=sc.nextDouble();
                        System.out.println("Enter the 2nd Number: ");
                        b=sc.nextDouble();
                        System.out.println("Sum is " + obj.add(a,b));
                        break;
                case 2:System.out.println("Enter the 1st Number: ");
                       a=sc.nextDouble();
                       System.out.println("Enter the 2nd Number: ");
                       b=sc.nextDouble();
                       System.out.println("Difference is " + obj.sub(a,b));
                       break;
                case 3:System.out.println("Enter the 1st Number: ");
                       a=sc.nextDouble();
                       System.out.println("Enter the 2nd Number: ");
                       b=sc.nextDouble();
                       System.out.println("Product is " + obj.mul(a,b));
                       break;
                case 4:System.out.println("Enter the 1st Number: ");
                       a=sc.nextDouble();
                       System.out.println("Enter the 2nd Number: ");
                       b=sc.nextDouble();
                       System.out.println("Quotient is " + obj.div(a,b));
                       break;
                case 5:System.out.println("Exiting the program.");
                       exit(0);
                default:
                      System.out.println("Please enter the right choice");
            }
        }while(c!=5);
    }
}