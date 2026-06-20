import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int qntDegraus = scanner.nextInt();

        for (int i = 1; i <= qntDegraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");  
    }
}