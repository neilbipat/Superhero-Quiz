import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the numerator.");
            int numerator = scanner.nextInt();
            System.out.println("Please enter the divisor");
            int divisor = scanner.nextInt();

            division(numerator, divisor);

        System.out.println("Error has happened");
    }

    public static void division(int numerator, int divisor){
        try {
            float result = numerator / divisor;
            System.out.println("Result of the division is: " + result);

        }catch (Exception e){
            System.out.println("ERRORRRRR!!!!");
        }
    }


}