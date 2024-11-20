import java.util.Scanner;

public class Tasks8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int sum;
        int average;
        int product;

        System.out.println("Enter first number: ");
        x = input.nextInt();

        System.out.println("Enter second number: ");
        y = input.nextInt();

        System.out.println("Enter third number: ");
        z = input.nextInt();

        sum = x + y;
        average = (x + y + z)/3;
        product = x * y * z;

        if (x < y && x < z)
        System.out.println("x is the smallest");

        if (y < z && y < x)
        System.out.println("y is the smallest");

        if (z < x && z < y)
        System.out.println("z is the smallest");

        if (x > y && x > z)
        System.out.println("x is the largest");

        if (y > z && y > x)
        System.out.println("y is the largest");

        if (z > x && z > y)
        System.out.println("z is the largest");











    }
}
