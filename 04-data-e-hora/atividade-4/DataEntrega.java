import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEntrega {
    public static void main(String[] args) {
    
        LocalDate dataInicio = LocalDate.of(2025, 3, 15);
        int prazoDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);
 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
 
        System.out.println("Data de entrega: " + dataEntrega.format(formatter));
    }
}