import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c_y = 2024;
        int b_y = scan.nextInt();
        int days = ((c_y - b_y) * 12) * 30;
        int mounths = days / 30;
        int years = mounths / 12;

        System.out.printf("%d, %d, %d\n", years, mounths, days);

        
        scan.close();
    }
    
}
