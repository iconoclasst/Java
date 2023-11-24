import java.util.Scanner;

public class Final {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double n1=scan.nextDouble();
        double n2=scan.nextDouble();
        double nf=scan.nextDouble();
        double avg=(n1+n2)/2;
        String result="";

        if(avg >= 7.0) {
            result="Approved";
        }
        else if(avg < 4.0) {
            result="Repproved";
        }
        else if(avg >= 4.0) {
            double favg=(avg+nf)/2;
            
            if(favg >= 5.0) {
                result="Approved in final grade";
            }
            else {
                result="Repproved";
            }
        }
        System.out.printf("The situation is: %s\n", result);
        scan.close();
    }
}