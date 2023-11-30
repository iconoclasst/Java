import java.util.Scanner;

// sum of even numbers in the fibonacci sequence
public class Fibo {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    
    System.out.print("1 ");
    int a1=1;
    int a2=2;
    int aux=0;
    int sum=0;

    for(int i=0; i < n; i++) {
        System.out.printf("%d ", a2);
        if(a2%2 == 0) {
            sum+=a2;
        }
        aux=a2+a1;
        a1=a2;
        a2=aux;

        if(aux >= n) {
            break;
        }
    }
    System.out.println("\n" + sum);
    scan.close();

    }
}
