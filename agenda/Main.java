import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    String cmd;
    Agenda agenda=null;
    
    while(true) {
        cmd=scan.nextLine();
        if(cmd.equals("end")) {
            break;
        }
        else if(cmd.equals("criar")) {
            System.out.println("Insira o nome da agenda:");
            String nome = scan.nextLine();
            agenda = new Agenda(nome);
            System.out.printf("Agenda \"%s\" criada com sucesso!!\n", nome);
        }
        else if(cmd.equals("adicionar")) {
            System.out.println("Insira um titulo para a tarefa: ");
            String titulo = scan.nextLine();
            agenda.adicionar(titulo);
        }
        else if(cmd.equals("listar")) {
            agenda.listar();
        }
        else {
            System.out.println("Comando invalido...");
        }
    }
    scan.close();
    }
}