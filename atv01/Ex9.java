import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int day = scanner.nextInt();
        int mm = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.printf("%02d:%02d %02d/%02d/%02d", hour, min, day, mm, year);

        scanner.close();
    }
}
