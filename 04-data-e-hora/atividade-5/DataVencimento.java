import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataVencimento {

    public static void main(String[] args) {
        LocalDate vencimentoOriginal = LocalDate.of(2025, 3, 20);
        int numeroMeses = 1;

        LocalDate vencimentoAdiado = vencimentoOriginal.plusMonths(numeroMeses);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Nova data de vencimento: " + vencimentoAdiado.format(formatter));
    }
}