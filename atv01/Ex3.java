import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;

        if(a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.printf("The value of C is %d", c);
        scan.close();
    }
}
