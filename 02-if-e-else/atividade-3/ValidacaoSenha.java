import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "123456";

        System.out.println("Digite a senha: ");
        String senhaInserida = scanner.nextLine();

        if (senhaInserida.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}