import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025,3, 10);
        LocalDate dataAtual = LocalDate.of(2025,3, 15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: " + dataEvento.format(formatter));
        System.out.println("Data atual: " + dataAtual.format(formatter));
 

        if (dataAtual.isBefore(dataEvento)) {
            System.out.println("O evento ainda está por vir");
        } else {
            System.out.println("O evento já ocorreu.");
        }
    }
}