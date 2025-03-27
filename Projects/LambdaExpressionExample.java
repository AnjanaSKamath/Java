//To learn java 8 features lambda expression and functional interfaces calculator prgoram

import java.util.*;

interface Calculator{
    void sum(int a,int b);
    default void multiply(int a,int b){
        System.out.println("Product is "+a*b);
    }
}

public class LambdaExpressionExample{
    public static void main (String[] args) {
        Calculator calc=(a,b) -> System.out.println("Sum is "+(a+b));
        calc.sum(10,5);
        calc.multiply(10,5);
    }
}