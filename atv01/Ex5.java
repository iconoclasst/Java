import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int aux = 0;

        System.out.printf("The value of A and B is %d and %d\n", a, b);

        aux = a;
        a = b;
        b = aux;

        System.out.printf("Now, the value of A and B is %d and %d\n", a, b);

        scan.close();
    }
}
