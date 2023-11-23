import java.util.Scanner;

public class Divisor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two values: ");
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        System.out.println("=============================");
        System.out.printf("Variable 1: %d\n", v1);
        System.out.printf("Variavle 2: %d\n", v2);
        
        //Integer Division
        int div = v1 / v2;

        //Rest of Division
        int rest = v1 % v2;

        //Broken Division
        float bDiv = (float)v1 / v2;

        //Results
        System.out.printf("Integer division: %d\nRest of division: %d\nFloat Division: %.2f", div, rest, bDiv);

        scanner.close();
    }
}
