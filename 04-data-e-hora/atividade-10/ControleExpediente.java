import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter);

        LocalTime saidaOficial = entrada.plusHours(cargaHoraria);
        Duration saldo = Duration.between(saidaOficial, saidaReal);
        saldo = saldo.abs();
        String saldoFormatado = saldo.toHours() + "h " + saldo.toMinutesPart() + "min";

        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaOficial.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));

        if (saidaReal.isAfter(saidaOficial)) {
            System.out.println("Saldo de horas: +" + saldoFormatado);
        } else if (saidaReal.isBefore(saidaOficial)) {
            System.out.println("Saldo de horas: -" + saldoFormatado);
        } else {
            System.out.println("Saldo de horas: 0h 0min");
        }
    }
}