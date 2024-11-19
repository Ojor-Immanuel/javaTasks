import java.util.Scanner;

public class Tasks6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.println("Enter first number: ");
        x = input.nextInt();

        System.out.println("Enter second number: ");
        y = input.nextInt();

        sum = x + y;
        product = x * y;
        difference = x - y;
        quotient = x / y;


        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Quotient is %d%n", quotient);


    }
}
