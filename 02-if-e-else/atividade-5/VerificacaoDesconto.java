import java.util.Scanner;

public class VerificacaoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        if (valor >= 100) {
            double desconto = valor * 0.10;
            double valorComDesconto = valor - desconto;
            System.out.printf("Desconto de 10%% aplicado.\nValor total: R$ %.2f\n", valorComDesconto);
        } else {
            System.out.printf("Nenhum desconto aplicado. \nValor total: R$ %.2f\n", valor);
        }
    }
}