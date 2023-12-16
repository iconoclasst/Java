import java.util.Scanner;

public class Sort {

    public static void fill(int[] vet) {
        Scanner scan=new Scanner(System.in);
        
        for(int i=0; i < vet.length; i++) {
            vet[i]=scan.nextInt();
        }
        scan.close();
    }

    public static void show(int[] vet) {
        System.out.print("[ ");
        for(int i=0; i< vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("]\n");
    }

    public static void sort(int[] vet) {
        int n = vet.length;
        boolean sw = true;

        while(sw) {
            sw=false;
            for(int i=0; i < n - 1; i++) {
                if(vet[i] > vet[i+1]) {
                    int aux = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1]=aux;
                    sw=true;
                }
            }
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] vet = new int[size];

        fill(vet);
        show(vet);
        sort(vet);
        show(vet);
        scan.close();
    }
}
