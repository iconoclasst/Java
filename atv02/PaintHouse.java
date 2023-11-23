import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        double s3 = scan.nextDouble();

        double p = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));

        System.out.printf("Total Area: %.2f", area);
        scan.close();
    } 
}