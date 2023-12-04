import java.util.Scanner;

public class Main {

    public static void commandLine() {
        Scanner scan = new Scanner(System.in);
        Moto moto=null;

        while(true) {
            System.out.println("Insert a command: ");
            String cmd=scan.nextLine();
            if(cmd.equals("end")) {
                break;
            }
            else if(cmd.equals("show")) {
                if(moto==null) {
                    System.out.println("Has no moto... Use the command \'init\'");
                }
                else {
                String str=moto.toString();
                System.out.println(str);
                }
            }
            else if(cmd.equals("init")) {
                System.out.println("Insert the power: ");
                int p=scan.nextInt();
                scan.nextLine();
                moto = new Moto(p);  
            }
            else if(cmd.equals("leave")) {
                moto.remove();
            }
            else if(cmd.equals("enter")) {
                System.out.println("Insert name and age: ");
                String n=scan.nextLine();
                int a=scan.nextInt();
                scan.nextLine();
                Person person = new Person(n, a);
                moto.insertPerson(person);
            }
            else if(cmd.equals("buy")) {
                System.out.println("Insert time: ");
                int time=scan.nextInt();
                moto.buyTime(time);
                scan.nextLine();
            }
            else if(cmd.equals("drive")) {
                System.out.println("Insert time: ");
                int t=scan.nextInt();
                scan.nextLine();
                moto.drive(t);
            }
            else if(cmd.equals("honk")) {
                moto.honk();
            }
            else {
                System.out.println("command not found");
            }
        }
        scan.close();
    }
    public static void main(String[] args) {
        commandLine();
    }   
}
