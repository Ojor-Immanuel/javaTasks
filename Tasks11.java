import java.util.Scanner;

public class Tasks11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int x;
        int y;

        System.out.println("Enter first number:");
        x = input.nextInt();

        System.out.println("Enter second number:");
        y = input.nextInt();

        if (x % y == 0)
        System.out.println("It is a multiple");

        if (x % y != 0)
        System.out.println("It is not a multiple");




    }
}
