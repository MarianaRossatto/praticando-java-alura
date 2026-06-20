import java.util.Scanner;

public class ContadorPositivosNegativos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        int numPositivos = 0;
        int numNegativos = 0;

        while (!entrada.equals("fim")){
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            entrada = scanner.nextLine();
    
            if (entrada.equals("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);

            if (numero >= 0) {
                numPositivos ++;
            } else {
                numNegativos ++;
            }
        }
        System.out.println("Números positivos: " + numPositivos);
        System.out.println("Números negativos: " + numNegativos);
    }
}