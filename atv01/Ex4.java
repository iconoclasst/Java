import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int product_value = scan.nextInt();
        int final_value = 0;
        int payment = scan.nextInt();

        if(payment == 1){
            final_value = product_value - (product_value * 15 / 100);
        } else if(payment == 2){
            final_value = product_value - (product_value * 10 / 100);
        } else if(payment == 3) {
            final_value = product_value;
        } else if(payment == 4) {
            final_value = product_value + (product_value * 10 / 100);
        }

        System.out.printf("The final value of the product with the %d payment option is %d\n", payment, final_value);
        scan.close();
    }
}
