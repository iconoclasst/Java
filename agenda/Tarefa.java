import java.util.Scanner;

public class Tarefa {
    private String titulo;

    public Tarefa(String titulo) {
        this.titulo=titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String newTitle) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Deseja mudar o titulo desta tarefa? (S/N)");
        char r = scan.next().charAt(0);
        if(r == 'S' || r == 's') {
            this.titulo=newTitle;
            System.out.println("Titulo alterado com sucesso!");
        }
        else {
            System.out.println("Operacao cancelada");
        }
        scan.close();
    }
}
