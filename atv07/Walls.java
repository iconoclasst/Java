import java.util.Scanner;

public class Walls {

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
            vet[i] = scan.nextInt();
        }
        scan.close();
    }

    public static int countWalls(int vet[]) {
        int count=1;
        int greater=vet[0];
        for(int i=0; i < vet.length - 1; i++) {
            if(vet[i + 1] > greater) {
                count++;
                greater=vet[i + 1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the number of walls: ");
        int size = scan.nextInt();
        int vet[] = new int[size];
        fill(vet);
        show(vet);
        System.out.printf("The number of walls that can be seen is %d", countWalls(vet));

        scan.close();  
    }    
}
