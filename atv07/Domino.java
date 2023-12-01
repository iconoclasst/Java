import java.util.Scanner;

public class Domino {

    public static void show(int vet[]) {
        System.out.print("[ ");
        for(int i=0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("]");
    }

    public static void fill(int vet[]) {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i < vet.length; i++) {
            vet[i]=scan.nextInt();
        }
        scan.close();
    }

    public static boolean isOrdered(int vet[]) {
        int aux=0;
        for(int i=0; i < vet.length - 1; i++) {
            if(vet[i]<=vet[i+1])
                aux+=1;
        }
        if(aux==vet.length - 1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int vet[] = new int[size];

        fill(vet);
        show(vet);
        if(isOrdered(vet)==true)
            System.out.println("Is ordered");
        else
            System.out.println("Isn't ordered");

        scan.close();
    }
}