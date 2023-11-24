import java.util.Scanner;

public class SetVet {

    static void show(int[] vet) {
        System.out.print("[ ");
        
        for(int i=0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert the size of array: ");
        int size = scan.nextInt();
        int[] n = new int[size];
        int[] m = new int[size];

        for(int i=0; i < size; i++) {
            int index = size-i-1;
            n[i] = scan.nextInt();
            m[index] = n[i];
        }

        show(n);
        show(m);

        scan.close();

    }
}