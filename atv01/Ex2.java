import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        String odev = "";
        String ngps = "";

        if(num % 2 == 0){
            odev = "even";
        } else {
            odev = "odd";
        }

        if(num < 0) {
            ngps = "negative";
        } else {
            ngps = "positive";
        }

        System.out.printf("The num %d is %s and %s\n", num, odev, ngps);

        scan.close();
    }
}
