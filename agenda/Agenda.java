import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
    private String nome;
    private List<Tarefa> tarefas = new ArrayList<>();

    public Agenda(String nome) {
        this.nome=nome;
    }

    public void adicionar(String titulo) {
        // Scanner scan = new Scanner(System.in);
        // String titulo = scan.nextLine();
        // // scan.nextLine();
        Tarefa tarefa = new Tarefa(titulo);
        tarefas.add(tarefa);
        // scan.close();
    }

    public void listar() {
        System.out.printf("AGENDA %s\n", Agenda.this.nome);
        System.out.println("---------------");
        int n = 1;
        for(Tarefa tarefa : tarefas) {
            System.out.printf("%d- %s\n", n, tarefa.getTitulo());
            n+=1;
        }
    }

    public void remover(String titulo) {
        Scanner scan = new Scanner(System.in);
        Iterator<Tarefa> iterator = tarefas.iterator();
        System.out.println("Deseja realmente remover este topico? (S/N)");
        char r = scan.next().charAt(0);
        if(r == 'S' || r == 's') {
            while(iterator.hasNext()) {
                Tarefa tarefa = iterator.next();
                if(tarefa.getTitulo().equals(titulo)) {
                    iterator.remove();
                    break;
                }
            }
        }
        scan.close();
    }

}