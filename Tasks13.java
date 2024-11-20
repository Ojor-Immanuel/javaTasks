import java.util.Scanner;
public class Tasks13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int radius;
        double area;
        int diameter;
        double circumference;



        System.out.println("Enter a number: ");
        radius = input.nextInt();

        diameter = 2 * radius;
        circumference = 2* Math.PI* radius;
        area = Math.PI * radius* radius;

        System.out.println(diameter);
        System.out.println(circumference);
        System.out.println(area);





    }
}
