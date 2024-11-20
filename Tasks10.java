import java.util.Scanner;

public class Tasks10 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int x;

        System.out.println("Enter a number:");

        x = input.nextInt();

        if (x % 2 == 0)
        System.out.println("Even");

        if (x % 2 != 0)
        System.out.println("Odd");




    }
}
