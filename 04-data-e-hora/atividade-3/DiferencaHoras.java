import java.time.Duration;
import java.time.LocalTime;

public class DiferencaHoras {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(14, 30, 0);
        LocalTime termino = LocalTime.of(16, 45, 0);

        Duration duracao = Duration.between(inicio, termino);

        System.out.println("Diferença de tempo: " + duracao.toHours() + 
                           " horas e " + duracao.toMinutesPart() + " minutos.");
    }
}