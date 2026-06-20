import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {

    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);
        int antecedenciaDias = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(antecedenciaDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do lembrete: " + dataLembrete.format(formatter));
    }
}