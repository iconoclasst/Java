import java.util.Scanner;

public class Smaller {

    public static int findSmaller(int vet[]) {
        int smaller=vet[0];
        for(int i = 0; i < vet.length; i++) {
            if(vet[i] < smaller)
                smaller=vet[i];
        }
        return smaller;
    }

    public static void show(int vet[]) {
        System.out.println("Array:");
        System.out.print("[ ");
        for(int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert the length of array: ");
        int size = scan.nextInt();
        int vet[] = new int[size];

        System.out.println("Insert the values on the array: ");
        for(int i = 0; i < size; i++) {
            vet[i]=scan.nextInt();
        }

        show(vet);
        int sm=findSmaller(vet);
        System.out.println("The smaller value in this array is " + sm);

        scan.close();
    }
}