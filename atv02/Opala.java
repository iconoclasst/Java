import java.util.Scanner;

public class Opala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speed = scan.nextInt();
        int tm = scan.nextInt();
        int consume = scan.nextInt();

        int time = tm/60;
        int distance = speed*time;
        float performance = distance/consume;

        System.out.printf("Total Performance of the car: %.2f", performance);

        scan.close();
    }
}
