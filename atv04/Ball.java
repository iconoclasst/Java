import java.util.Scanner;

public class Ball {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char s = scan.next().charAt(0);
        int f = scan.nextInt();
        int p=0;
        if(s == 'c') {
             p = ((f*18)-80)/10;
        }
        else if(s == 'b') {
            p = ((f*20)-80)/10;
        }

        String result="";
        if(p < 150) {
            result="weak";
        }
        else if(p < 180) {
            result="perfect";
        }
        else if(p < 210) {
            result="satisfied";
        } else {
            result="very strong";
        }

        System.out.printf("The level of strength is %d and this is %s \n", p, result);
        scan.close();

    }
}