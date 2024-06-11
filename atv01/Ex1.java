import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum = a + b;

        System.out.printf("the sum of %d with %d is %d\n", a, b, sum);

        if(sum < c) {
            System.out.printf("the sum value %d is less than C value %d\n", sum, c);
        }

        scan.close();
    }
}
