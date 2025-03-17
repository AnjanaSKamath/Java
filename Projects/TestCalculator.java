import java.util.*;

interface CalculatorService{
    double add(double a,double b);
    double sub(double a,double b);
    double mul(double a,double b);
    double div(double a,double b);
}

abstract class AbstractCalculator implements CalculatorService{
    public double add(double a,double b)
    {
        return a+b;
    }
    public double sub(double a,double b)
    {
        return a-b;
    }
}

class CalculatorImpl extends AbstractCalculator{
    public double mul(double a,double b){
        return a*b;
    }
    public double div(double a,double b){
        if (b==0){
            throw new ArithmeticException();
        }
        else{
            return a/b;
        }
    }
}

public class TestCalculator{
    public static void main(String[] args) {
        CalculatorImpl calculator=new CalculatorImpl();
        Scanner sc=new Scanner(System.in);
        double number1,number2;
        int choice;
        do{
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\nEnter the serial number of the operation to be performed: ");
            choice=sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the 1st Number: ");
                        number1=sc.nextDouble();
                        System.out.println("Enter the 2nd Number: ");
                        number2=sc.nextDouble();
                        System.out.println("Sum is " + calculator.add(number1,number2));
                        break;
                case 2:System.out.println("Enter the 1st Number: ");
                       number1=sc.nextDouble();
                       System.out.println("Enter the 2nd Number: ");
                       number2=sc.nextDouble();
                       System.out.println("Difference is " + calculator.sub(number1,number2));
                       break;
                case 3:System.out.println("Enter the 1st Number: ");
                       number1=sc.nextDouble();
                       System.out.println("Enter the 2nd Number: ");
                       number2=sc.nextDouble();

                       System.out.println("Product is " + calculator.mul(number1,number2));
                       break;
                case 4:System.out.println("Enter the 1st Number: ");
                       number1=sc.nextDouble();
                       System.out.println("Enter the 2nd Number: ");
                       number2=sc.nextDouble();
                       try{
                           System.out.println("Quotient is " + calculator.div(number1,number2));
                       }
                       catch(ArithmeticException e){
                           System.out.println("Division by zero is not possible");
                       }
                       break;
                case 5:System.out.println("Exiting the program.");
                       break;
                default:
                      System.out.println("Please enter the right choice");
            }
        }while(choice!=5);
    }
}