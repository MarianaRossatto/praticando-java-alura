import java.util.ArrayList;
import java.util.List;

public class MainTarefa {
    public static void main(String[] args) {
        List <Tarefa> listaTarefas = new ArrayList<>();

        Tarefa t1 = new Tarefa("Estudar Java", false); 
        Tarefa t2 = new Tarefa("Fazer exercícios", true); 
        listaTarefas.add(t1);
        listaTarefas.add(t2);

        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);          
        }
    }
}