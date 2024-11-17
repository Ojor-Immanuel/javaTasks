import java.util.Scanner;

public class Tasks2 {
 public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int x;
    int y;
    int z;
    int result;

    System.out.print("Enter first number: ");
     x = input.nextInt();

     System.out.print("Enter second number: ");
     y = input.nextInt();

     System.out.print("Enter third  number: ");
     z = input.nextInt();

     result = x * y * z;

     System.out.printf("%s%n%d", "Product is", result);


 }   
}
