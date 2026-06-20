import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorarioSydney {
    public static void main(String[] args) {
        ZonedDateTime horarioAtual = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual no sistema: " + horarioAtual.format(formatter));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(formatter));
    }
}