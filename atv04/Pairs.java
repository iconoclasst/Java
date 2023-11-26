import java.util.Scanner;

public class Pairs {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int sump=0;
        int sumi=0;

        if(a > b)
            System.out.println("Invalid!! the value 1 cannot be greater than value 2.");
        else {
            for(int i = a; i <= b; i++) {
                if(i%2==0)
                    sump+=i;
                if(i%2!=0)
                    sumi+=i;
            }
            System.out.printf("The sum of even values is %d\n", sump);
            System.out.printf("The sum of odd values is %d\n", sumi);
        }

        scan.close();
    }
}
