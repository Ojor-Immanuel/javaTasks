import java.util.Scanner;
public class Tasks13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int radius = input.nextInt();


        System.out.printf("diameter = %d%n", 2 * radius);
        System.out.printf("circumference = %f%n", 2 * Math.PI * radius);
        System.out.printf("area = %f%n", Math.PI * radius * radius);





    }
}
