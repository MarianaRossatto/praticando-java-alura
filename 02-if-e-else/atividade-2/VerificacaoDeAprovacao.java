public class VerificacaoDeAprovacao {
    public static void main(String[] args) {
        double media = 8.2;
        // double media = 5.8;
        // double media = 4.3;

        if (media >= 7) {
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("O estudante teve média " + media + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e está reprovado.");
        }
    }
}