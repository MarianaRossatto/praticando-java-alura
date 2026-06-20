import java.time.LocalDate;
import java.time.LocalTime;

public class DataHoraAtual {
    public static void main(String[] args) {
        String tarefa = "Enviar relatório semanal";
 
        LocalDate dataAtual = LocalDate.now(); 
        LocalTime horaAtual = LocalTime.now(); 
 
        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data de criação: " + dataAtual);
        System.out.println("Hora de criação: " + horaAtual);
    }
}